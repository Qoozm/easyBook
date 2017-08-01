package com.xupt.service.serviceImpl;

import com.xupt.bean.Essay;
import com.xupt.bean.EssayCategory;
import com.xupt.dao.IEssayCategoryDao;
import com.xupt.dao.IEssayDao;
import com.xupt.service.IEssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EssayServiceImpl implements IEssayService {

    @Autowired
    private IEssayCategoryDao essayCategoryDao;

    @Autowired
    private IEssayDao essayDao;

    public List<EssayCategory> loadHotSubject() {
        List<EssayCategory> essayCategories = essayCategoryDao.findHotEssayCategory();
        return  essayCategories;
    }

    public List<Essay> loadHotEssay() {
        List<Essay> essays = essayDao.findEssayHomePage();
        return essays;
    }

    public List<Essay> loadAnthologyEssayInfo(Integer essay_anthology_id) {
        List<Essay> essays = essayDao.findUserAnthologyEssayInfo(essay_anthology_id);
        return essays;
    }

    public Essay loadEssayContent(Integer essay_id) {
        Essay essay = essayDao.findEssayByEssayId(essay_id);
        return essay;
    }
}
