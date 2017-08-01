package com.xupt.controller;

import com.xupt.bean.Anthology;
import com.xupt.bean.Essay;
import com.xupt.service.IAnthologyService;
import com.xupt.service.IEssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EditEssayController {

    private IAnthologyService anthologyService;

    private IEssayService essayService;

    @Autowired
    public EditEssayController(IAnthologyService anthologyService, IEssayService essayService) {
        this.anthologyService = anthologyService;
        this.essayService = essayService;
    }

    @RequestMapping(value = "/editEssay/acquireUserAnthology", method = RequestMethod.GET)
    @ResponseBody
    public List<Anthology> acquireUserAnthology(@RequestParam("user_id") Integer user_id) {
        List<Anthology> anthologies = anthologyService.loadAnthology(user_id);
        return anthologies;
    }

    @RequestMapping(value = "/editEssay/acquireAnthologyEssayInfo", method = RequestMethod.GET)
    @ResponseBody
    public List<Essay> acquireAnthologyEssayInfo(@RequestParam("essay_anthology_id") Integer essay_anthology_id) {
        List<Essay> essays = essayService.loadAnthologyEssayInfo(essay_anthology_id);
        return essays;
    }

    @RequestMapping(value = "/editEssay/acquireEssayContent", method = RequestMethod.GET)
    @ResponseBody
    public Essay acquireEssayContent(@RequestParam("essay_id") Integer essay_id) {
        Essay essay = essayService.loadEssayContent(essay_id);
        return essay;
    }

    @RequestMapping(value = "/editEssay/publishEssay", method = RequestMethod.POST)
    public String publishEssay(@RequestBody Essay essay) {
        return null;
    }
}
