package com.xupt.controller;

import com.xupt.bean.User;
import com.xupt.service.IAnthologyService;
import com.xupt.service.IUserService;
import com.xupt.utils.MD5;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 慧乔乔 on 2017/7/13.
 */
@Controller
public class UserController {

    private String DEFAULT_USER_HEAD_PICTURE_PATH = "/static/img/user.png";

    private final IUserService userService;

    private final IAnthologyService anthologyService;

    @Autowired
    public UserController(IUserService userService, IAnthologyService anthologyService) {
        this.userService = userService;
        this.anthologyService = anthologyService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam("user_account") String user_account, @RequestParam("user_password") String user_password,
                        @RequestParam(value = "rememberMe", required = false) String rememberMe,
                        HttpSession session,
                        HttpServletResponse response,
                        RedirectAttributes model) {

        user_password = MD5.encoderByMd5(user_password);
        User user = userService.loginCheck(user_account, user_password);

        if (user != null) {

            session.setAttribute("user", user);

            if (rememberMe != null && rememberMe.equals("1")) {
                Cookie accountCookie = new Cookie("4", user_account);

                Cookie passwordCookie = new Cookie("1", user_password);

                Cookie cookie1 = new Cookie("2", MD5.encoderByMd5("54321"));
                cookie1.setPath("/");
                cookie1.setMaxAge(60 * 60 * 24 * 7);
                response.addCookie(cookie1);

                Cookie cookie2 = new Cookie("3", MD5.encoderByMd5("54321sdf"));
                cookie2.setPath("/");
                cookie2.setMaxAge(60 * 60 * 24 * 7);
                response.addCookie(cookie2);

                Cookie cookie3 = new Cookie("5", MD5.encoderByMd5("543ccc21"));
                cookie3.setPath("/");
                cookie3.setMaxAge(60 * 60 * 24 * 7);
                response.addCookie(cookie3);

                Cookie cookie4 = new Cookie("6", MD5.encoderByMd5("54321aaa"));
                cookie4.setPath("/");
                cookie4.setMaxAge(60 * 60 * 24 * 7);
                response.addCookie(cookie4);

                accountCookie.setMaxAge(60 * 60 * 24 * 7);
                passwordCookie.setMaxAge(60 * 60 * 24 * 7);

                accountCookie.setPath("/");
                passwordCookie.setPath("/");

                response.addCookie(accountCookie);
                response.addCookie(passwordCookie);
            }
            return "redirect:/";
        }

        String result = "账号或密码错误！";
        model.addFlashAttribute("result", result);
        return "redirect:/loginUI";
    }

    @RequestMapping(value = "/loginOut", method = RequestMethod.GET)
    public ModelAndView loginOut(HttpSession session, HttpServletRequest request, HttpServletResponse response) {

        if (session.getAttribute("user") != null) {

            session.removeAttribute("user");
            session.invalidate();

            Cookie[] cookies = request.getCookies();

            for (Cookie cookie : cookies) {

                cookie.setMaxAge(0);
                cookie.setPath("/");
                response.addCookie(cookie);
            }
        }
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/loginUI", method = RequestMethod.GET)
    public ModelAndView loginUI() {
        return new ModelAndView("sign_in");
    }

    @RequestMapping(value = "/registerUI", method = RequestMethod.GET)
    public ModelAndView registerUI() {
        return new ModelAndView("sign_up");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(RedirectAttributes model, User user) {

        user.setUser_password(MD5.encoderByMd5(user.getUser_password()));
        user.setUser_head_icon_path(DEFAULT_USER_HEAD_PICTURE_PATH);

        boolean result = userService.register(user);

        String message;

        if (result) {
            message = "注册成功";
            anthologyService.initUserAnthology(user.getUser_id());
            model.addFlashAttribute("result", message);
            return "redirect:/loginUI";
        } else {
            message = "注册失败";
            model.addFlashAttribute("result", message);
            return "redirect:/registerUI";
        }
    }

    @RequestMapping(value = "/register/checkPhone", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> registerCheckPhone(@RequestBody String phone) {

        JSONObject jsonObject = new JSONObject(phone);
        phone = jsonObject.get("user_phone").toString();

        boolean result = false;
        if (null == userService.registerCheckPhone(phone)) {
            result = true;
        }

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);

        return resultMap;
    }

    @RequestMapping(value = "/register/checkName", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> registerCheckName(@RequestBody String name) {

        boolean result = false;
        name = new JSONObject(name).getString("user_name");

        if (userService.registerCheckName(name) == null) {
            result = true;
        }

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);

        return resultMap;
    }

    @RequestMapping(value = "/register/checkEmail", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> registerCheckEmail(@RequestBody String email) {

        boolean result = false;

        email = new JSONObject(email).getString("user_email");

        if (userService.registerCheckEmail(email) == null) {
            result = true;
        }

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);

        return resultMap;
    }
}
