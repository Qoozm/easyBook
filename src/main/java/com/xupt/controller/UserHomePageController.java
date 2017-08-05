package com.xupt.controller;

import com.xupt.bean.Anthology;
import com.xupt.bean.Essay;
import com.xupt.bean.User;
import com.xupt.service.IAnthologyService;
import com.xupt.service.IEssayService;
import com.xupt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserHomePageController {

    private final IUserService userService;
    private final IEssayService essayService;
    private final IAnthologyService anthologyService;

    @Autowired
    public UserHomePageController(IUserService userService,
                                  IEssayService essayService,
                                  IAnthologyService anthologyService) {
        this.userService = userService;
        this.essayService = essayService;
        this.anthologyService = anthologyService;
    }

    @RequestMapping(value = "/userHomePage", method = RequestMethod.GET)
    public String userHomePage() {
        return "user";
    }

    @RequestMapping(value = "/userHomePage/loadCurrentUser", method = RequestMethod.GET)
    @ResponseBody
    public User loadCurrentUser(HttpSession session) {
        Integer user_id = ((User) session.getAttribute("user")).getUser_id();
        return userService.searchUserById(user_id);
    }

    @RequestMapping(value = "/userHomePage/loadCurrentUserEssay", method = RequestMethod.GET)
    @ResponseBody
    public List<Essay> loadCurrentUserEssay(HttpSession session) {
        Integer user_id = ((User) session.getAttribute("user")).getUser_id();
        return essayService.searchEssayByUserId(user_id);
    }

    @RequestMapping(value = "/userHomePage/loadCurrentUserAnthology", method = RequestMethod.GET)
    @ResponseBody
    public List<Anthology> loadCurrentUserAnthology(HttpSession session) {
        Integer user_id = ((User) session.getAttribute("user")).getUser_id();
        return anthologyService.searchAnthologyByUserId(user_id);
    }
}
