package com.xupt.dao;

import com.xupt.bean.Essay;

import java.util.Date;
import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/14.
 */
public interface IEssayDao {

    public int save(Essay essay);

    public void deleteById(Integer essay_id);

    public void updateAll(Essay essay);

    public void uodateEssayContent(Essay essay);

    public void updateEssayTitle(Essay essay);

    public void updateEssayVisits(Essay essay);

    public void updateEssayThumb(Essay essay);

    public Essay findOneByEssayId(Integer essay_id);

    public List<Essay> findByEssayCategory(Integer essayCategory);

    public List<Essay> findHotEssayWeek();

    public List<Essay> findHotEssayMonth();

    public List<Essay> findEssayByUserId(Integer userId);

    public List<Essay> findAll();
}
