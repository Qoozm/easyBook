package com.xupt.service;

import com.xupt.bean.Essay;
import com.xupt.bean.EssayCategory;

import java.util.List;

public interface IEssayService {

    public List<EssayCategory> loadHotSubject();

    public List<Essay> loadHotEssay();

    public List<Essay> loadAnthologyEssayInfo(Integer essay_anthology_id);

    public Essay loadEssayContent(Integer essay_id);
}
