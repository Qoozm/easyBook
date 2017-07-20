package com.xupt.controller;

import com.xupt.bean.User;
import com.xupt.service.IUserService;
import com.xupt.utils.MD5;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @Autowired
    IUserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView login(@RequestParam("account") String account, @RequestParam("password") String password, @RequestParam(value = "remeberme", required = false) String remeberme, HttpSession session,
                                HttpServletResponse response) {

        password = MD5.encoderByMd5(password);
        User user = userService.loginCheck(account, password);

        if (user != null) {

            session.setAttribute("user", user);

            if (remeberme != null && remeberme.equals("1")) {
                Cookie accountCookie = new Cookie("4", account);

                Cookie passwordCookie = new Cookie("1", password);

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
            return new ModelAndView("redirect:/index.jsp");
        }

        return new ModelAndView("sign_in");
    }

    @RequestMapping(value = "/loginout", method = RequestMethod.GET)
    public ModelAndView loginout(HttpSession session, HttpServletRequest request, HttpServletResponse response) {

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
        return new ModelAndView("redirect:/index.jsp");
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
    public ModelAndView register(User user) {

        user.setUser_fans(0);
        user.setUser_essay_thumb(0);
        user.setUser_password(MD5.encoderByMd5(user.getUser_password()));

        boolean result = userService.register(user);
        return new ModelAndView("sign_in", "result", result);
    }

    @RequestMapping(value = "/register/checkphone", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> registerCheckPhone(@RequestBody String phone) {

        JSONObject jsonObject = new JSONObject(phone);
        phone = jsonObject.get("phone").toString();

        boolean result = false;
        if (null == userService.registerCheckPhone(phone)) {
            result = true;
        }

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);

        return resultMap;
    }

    @RequestMapping(value = "/register/checkname", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> registerCheckName(@RequestBody String name) {

        boolean result = false;
        name = new JSONObject(name).getString("userName");

        if (userService.registerCheckName(name) == null) {
            result = true;
        }

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);

        return resultMap;
    }

    @RequestMapping(value = "/register/checkemail", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, Object> registerCheckEmail(@RequestBody String email) {

        boolean result = false;

        email = new JSONObject(email).getString("email");

        if (userService.registerCheckEmail(email) == null) {
            result = true;
        }

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("result", result);

        return resultMap;
    }
}
