package com.xupt.service;

import com.xupt.bean.Essay;

import java.util.List;

public interface IEssayService {

    public void newEssay(Essay essay);

    public List<Essay> searchHotEssay();

    public List<Essay> searchWheelPhoto();

    public List<Essay> searchAnthologyEssayInfoByAnthologyId(Integer essay_anthology_id);

    public Essay searchEssayById(Integer essay_id);

    public List<Essay> searchEssayByUserId(Integer essay_user_id);

    public void deleteEssayById(Integer essay_id);
}
