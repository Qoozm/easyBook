package com.xupt.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xupt.bean.Essay;
import com.xupt.bean.EssayCategory;
import com.xupt.bean.User;
import com.xupt.service.IEssayService;
import com.xupt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class HomePageController {

    private IEssayService essayService;

    private IUserService userService;

    @Autowired
    public HomePageController(IUserService userService, IEssayService essayService) {
        this.userService = userService;
        this.essayService = essayService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage() {

        return "index";
    }

    @RequestMapping(value = "/writeEssay", method = RequestMethod.GET)
    public String writeEssay(HttpSession session) {
        User user = (User) session.getAttribute("user");

        if (user != null) {
            return "essayEdit";
        } else {
            return "redirect:/loginUI";
        }
    }

    @RequestMapping(value = "/homepage/loadSubject", method = RequestMethod.GET)
    @ResponseBody
    public List<EssayCategory> loadSubject() {

        List<EssayCategory> essayCategories = essayService.loadHotSubject();

        return essayCategories;
    }

    @RequestMapping(value = "/homepage/loadEssay", method = RequestMethod.GET)
    @ResponseBody
    public List<Essay> loadEssay() {

        List<Essay> essays = essayService.loadHotEssay();

        return essays;
    }

    @RequestMapping(value = "/homepage/loadAuthor", method = RequestMethod.GET)
    @ResponseBody
    public List<User> loadAuthor(@RequestParam("currentPage") int currentPage) {

        PageHelper.startPage(currentPage, 5);
        List<User> authors = userService.loadHotAuthor();
        PageInfo pageInfo = new PageInfo(authors);

        return authors;
    }
}
