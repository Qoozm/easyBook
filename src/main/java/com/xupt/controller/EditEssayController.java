package com.xupt.controller;

import com.xupt.bean.Anthology;
import com.xupt.bean.Essay;
import com.xupt.service.IAnthologyService;
import com.xupt.service.IEssayService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
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
        try {
            File file = new File(essay.getEssay_content_path());
            if (file.exists()) {
                FileChannel fileChannel = new FileInputStream(essay.getEssay_content_path()).getChannel();
                ByteBuffer buffer = ByteBuffer.allocate(2048);
                essay.setEssay_content("");
                while (fileChannel.read(buffer) > 0) {
                    buffer.flip();
                    essay.setEssay_content(essay.getEssay_content() + Charset.forName("UTF-8").decode(buffer));
                    buffer.clear();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return essay;
    }

    @RequestMapping(value = "/editEssay/publishEssay", method = RequestMethod.POST)
    @ResponseBody
    public String publishEssay(@RequestBody String essayInformation, HttpServletRequest request) {
        JSONObject essayJson = new JSONObject(essayInformation);
        String essay_title = essayJson.getString("essay_title");
        Integer essay_user_id = essayJson.getInt("essay_user_id");
        String essay_content = essayJson.getString("essay_content");
        String essay_pubDate = essayJson.getString("essay_pubDate");
        Integer essay_anthology_id = essayJson.getInt("essay_anthology_id");

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

        essayService.newEssay(essay);

        return "redirect:/writeEssay";
    }

    @RequestMapping(value = "/editEssay/newAnthology", method = RequestMethod.POST)
    public String newAnthology(@RequestParam("user_id") Integer user_id,
                             @RequestParam("anthology_name") String anthology_name) {
        anthologyService.newAnthology(user_id, anthology_name);
        return "redirect:/writeEssay";
    }

    @RequestMapping(value = "/editEssay/deleteEssay", method = RequestMethod.POST)
    public String deleteEssay(@RequestBody String essay_id) {
        essayService.deleteEssayById(new JSONObject(essay_id).getInt("essay_id"));
        return "redirect:/writeEssay";
    }
}
