package com.xupt.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xupt.bean.Essay;
import com.xupt.bean.EssaySubject;
import com.xupt.bean.HomePageEssay;
import com.xupt.bean.User;
import com.xupt.service.IEssaySubjectService;
import com.xupt.service.IEssayService;
import com.xupt.service.IUserService;

import com.xupt.utils.GetEssayContent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HomePageController {

    private final IEssayService essayService;

    private final IUserService userService;

    private final IEssaySubjectService essaySubjectService;

    @Autowired
    public HomePageController(IEssayService essayService,
                              IUserService userService,
                              IEssaySubjectService essayCategoryService) {
        this.essayService = essayService;
        this.userService = userService;
        this.essaySubjectService = essayCategoryService;
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
    public List<EssaySubject> loadSubject() {
        return essaySubjectService.loadHotSubject();
    }

    @RequestMapping(value = "/homepage/loadEssay", method = RequestMethod.GET)
    @ResponseBody
    public List<HomePageEssay> loadEssay() {
        List<HomePageEssay> homePageEssayList = essayService.searchHotEssay();
        for (HomePageEssay homePageEssay : homePageEssayList) {
            homePageEssay.setEssay_content(GetEssayContent.getEssayContent(homePageEssay.getEssay_content_path()));
        }
        return homePageEssayList;
    }

    @RequestMapping(value = "/homepage/loadAuthor", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> loadAuthor(@RequestParam("currentPage") int currentPage) {

        PageHelper.startPage(currentPage, 5);
        List<User> authors = userService.loadHotAuthor();
        PageInfo<User> pageInfo = new PageInfo<User>(authors);

        if (pageInfo.getPages() > 20) {
            pageInfo.setPages(20);
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("authors", authors);
        map.put("pageCounts", pageInfo.getPages());

        return map;
    }

    @RequestMapping(value = "/homepage/loadWheelPhoto", method = RequestMethod.GET)
    @ResponseBody
    public List<Essay> loadWheelPhoto() {
        List<Essay> essayList = essayService.searchWheelPhoto();
        for (Essay essay : essayList) {
            essay.setEssay_content(GetEssayContent.getEssayContent(essay.getEssay_content_path()));
        }
        return essayList;
    }
}
