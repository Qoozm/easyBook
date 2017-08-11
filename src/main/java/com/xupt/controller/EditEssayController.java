package com.xupt.controller;

import com.xupt.bean.Anthology;
import com.xupt.bean.Essay;
import com.xupt.service.IAnthologyService;
import com.xupt.service.IEssayService;
import com.xupt.utils.GetEssayContent;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Controller
public class EditEssayController {

    private String ESSAY_DIRECTORY = "essays";

    private final IAnthologyService anthologyService;

    private final IEssayService essayService;

    @Autowired
    public EditEssayController(IAnthologyService anthologyService, IEssayService essayService) {
        this.anthologyService = anthologyService;
        this.essayService = essayService;
    }

    @RequestMapping(value = "/editEssay/acquireUserAnthology", method = RequestMethod.GET)
    @ResponseBody
    public List<Anthology> acquireUserAnthology(@RequestParam("user_id") Integer user_id) {
        return anthologyService.searchAnthologyByUserId(user_id);
    }

    @RequestMapping(value = "/editEssay/acquireAnthologyEssayInfo", method = RequestMethod.GET)
    @ResponseBody
    public List<Essay> acquireAnthologyEssayInfo(@RequestParam("essay_anthology_id") Integer essay_anthology_id) {
        return essayService.searchAnthologyEssayInfoByAnthologyId(essay_anthology_id);
    }

    @RequestMapping(value = "/editEssay/acquireEssayContent", method = RequestMethod.GET)
    @ResponseBody
    public Essay acquireEssayContent(@RequestParam("essay_id") Integer essay_id) {
        Essay essay = essayService.searchEssayById(essay_id);
        essay.setEssay_content(GetEssayContent.getEssayContent(essay.getEssay_content_path()));
        return essay;
    }

    @RequestMapping(value = "/editEssay/publishEssay", method = RequestMethod.POST)
    @ResponseBody
    public Boolean publishEssay(@RequestBody String essayInformation, HttpServletRequest request) {
        JSONObject essayJson = new JSONObject(essayInformation);
        String essay_title = essayJson.getString("essay_title");
        Integer essay_user_id = essayJson.getInt("essay_user_id");
        String essay_content = essayJson.getString("essay_content");
        String essay_pubDate = essayJson.getString("essay_pubDate");
        Integer essay_anthology_id = essayJson.getInt("essay_anthology_id");
        Integer essay_photo = essayJson.getInt("essay_photo");

        String essayDirectory = request.getServletContext().getRealPath("/") + ESSAY_DIRECTORY;
        File file = new File(essayDirectory);
        if (!file.exists()) {
            file.mkdir();
        }

        String essayFileName = essayDirectory + File.separator + essay_user_id + System.currentTimeMillis() + ".txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(essayFileName);
            fileOutputStream.write(essay_content.getBytes());
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        Essay essay = new Essay();
        essay.setEssay_content_path(essayFileName);
        essay.setEssay_user_id(essay_user_id);
        try {
            essay.setEssay_pubDate(new SimpleDateFormat("yyyy-MM-dd").parse(essay_pubDate));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        essay.setEssay_title(essay_title);
        essay.setEssay_anthology_id(essay_anthology_id);
        essay.setEssay_photo(essay_photo);

        essayService.newEssay(essay);

        return true;
    }

    @RequestMapping(value = "/editEssay/amendEssay", method = RequestMethod.POST)
    @ResponseBody
    public Boolean amendEssay(@RequestBody String essayInformation) {
        JSONObject essayJson = new JSONObject(essayInformation);
        Integer essay_id = essayJson.getInt("essay_id");
        Essay essay = essayService.searchEssayById(essay_id);
        essay.setEssay_anthology_id(essayJson.getInt("essay_anthology_id"));
        essay.setEssay_title(essayJson.getString("essay_title"));
        essay.setEssay_photo(essayJson.getInt("essay_photo"));
        try {
            essay.setEssay_pubDate(new SimpleDateFormat("yyyy-MM-dd").parse(essayJson.getString("essay_pubDate")));
        } catch (ParseException e) {
            e.printStackTrace();
        }

        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(essay.getEssay_content_path());
            fileOutputStream.write(essayJson.getString("essay_content").getBytes());
            fileOutputStream.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        essayService.amendEssay(essay);
        return true;
    }

    @RequestMapping(value = "/editEssay/newAnthology", method = RequestMethod.POST)
    @ResponseBody
    public Boolean newAnthology(@RequestParam("user_id") Integer user_id,
                             @RequestParam("anthology_name") String anthology_name) {
        anthologyService.newAnthology(user_id, anthology_name);
        return true;
    }

    @RequestMapping(value = "/editEssay/deleteEssay", method = RequestMethod.POST)
    @ResponseBody
    public Boolean deleteEssay(@RequestBody String essay_id) {
        essayService.deleteEssayById(new JSONObject(essay_id).getInt("essay_id"));
        return true;
    }
}
