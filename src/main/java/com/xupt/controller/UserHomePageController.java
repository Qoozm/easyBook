package com.xupt.controller;

import com.xupt.bean.*;
import com.xupt.service.*;
import com.xupt.utils.GetEssayContent;
import com.xupt.utils.MergeDynamicInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
public class UserHomePageController {

    private final IUserService userService;
    private final IEssayService essayService;
    private final IAnthologyService anthologyService;
    private final IAttentionUserService attentionUserService;
    private final IAttentionSubjectService attentionSubjectService;
    private final ICommentService commentService;
    private final IThumbService thumbService;

    @Autowired
    public UserHomePageController(IUserService userService,
                                  IEssayService essayService,
                                  IAnthologyService anthologyService,
                                  IAttentionUserService attentionUserService,
                                  IAttentionSubjectService attentionSubjectService,
                                  ICommentService commentService,
                                  IThumbService thumbService) {
        this.userService = userService;
        this.essayService = essayService;
        this.anthologyService = anthologyService;
        this.attentionUserService = attentionUserService;
        this.attentionSubjectService = attentionSubjectService;
        this.commentService = commentService;
        this.thumbService = thumbService;
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
        List<Essay> essays = essayService.searchEssayByUserId(user_id);
        for (Essay essay : essays) {
            essay.setEssay_content(GetEssayContent.getEssayContent(essay.getEssay_content_path()));
        }
        return essays;
    }

    @RequestMapping(value = "/userHomePage/loadCurrentUserAnthology", method = RequestMethod.GET)
    @ResponseBody
    public List<Anthology> loadCurrentUserAnthology(HttpSession session) {
        Integer user_id = ((User) session.getAttribute("user")).getUser_id();
        return anthologyService.searchAnthologyByUserId(user_id);
    }

    @RequestMapping(value = "/userHomePage/loadDynamic", method = RequestMethod.GET)
    @ResponseBody
    public Map<Integer, Object> loadDynamic(HttpSession session) {
        Integer user_id = ((User) session.getAttribute("user")).getUser_id();

        List<DynamicAttentionUser> dynamicAttentionUserList = attentionUserService.searchUserDynamicAttentionUser(user_id);
        List<DynamicAttentionSubject> dynamicAttentionSubjectList = attentionSubjectService.searchUserDynamicAttentionSubject(user_id);
        List<DynamicComment> dynamicCommentList = commentService.searchDynamicComment(user_id);
        List<DynamicThumb> dynamicThumbList = thumbService.searchDynamicThumb(user_id);

        Collections.sort(dynamicCommentList);
        Collections.sort(dynamicThumbList);
        Collections.sort(dynamicAttentionSubjectList);
        Collections.sort(dynamicAttentionUserList);

        List<Object> list = new ArrayList<Object>();
        MergeDynamicInfo.merge(dynamicThumbList, dynamicCommentList, dynamicAttentionSubjectList, dynamicAttentionUserList, list);

        Map<Integer, Object> map = new HashMap<Integer, Object>();
        for (int i = 0; i < list.size(); i++) {
            map.put(i + 1, list.get(i));
        }
        return map;
    }
}
