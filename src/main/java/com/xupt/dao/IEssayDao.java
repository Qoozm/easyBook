package com.xupt.dao;

import com.xupt.bean.Essay;
import com.xupt.bean.HomePageEssay;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/14.
 */
public interface IEssayDao {

    public int save(Essay essay);

    public void deleteEssayById(Integer essay_id);

    public void updateEssay(Essay essay);

    public void updateEssayVisits(@Param("essay_visits") Integer essay_visits,
                                  @Param("essay_id") Integer essay_id);

    public void updateEssayThumb(@Param("essay_thumb") Integer essay_thumb,
                                 @Param("essay_id") Integer essay_id);

    public Essay findEssayByEssayId(Integer essay_id);

    public List<Essay> findEssayByEssaySubject(Integer essayCategory);

    public List<Essay> findHotEssayWeek();

    public List<Essay> findHotEssayMonth();

    public List<Essay> findEssayByUserId(Integer userId);

    public List<HomePageEssay> findEssayHomePage();

    public List<Essay> findUserAnthologyEssayInfo(Integer essay_anthology_id);

    public List<Essay> findWheelPhoto();

    public List<Essay> findAll();
}
