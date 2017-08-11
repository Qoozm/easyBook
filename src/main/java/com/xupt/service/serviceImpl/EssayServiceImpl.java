package com.xupt.service.serviceImpl;

import com.xupt.bean.Essay;
import com.xupt.bean.HomePageEssay;
import com.xupt.dao.IEssayDao;
import com.xupt.service.IEssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EssayServiceImpl implements IEssayService {

    private final IEssayDao essayDao;

    @Autowired
    public EssayServiceImpl(IEssayDao essayDao) {
        this.essayDao = essayDao;
    }

    public void newEssay(Essay essay) {
        essayDao.save(essay);
    }

    public void amendEssay(Essay essay) {
        essayDao.updateEssay(essay);
    }

    public List<HomePageEssay> searchHotEssay() {
        return essayDao.findEssayHomePage();
    }

    public List<Essay> searchWheelPhoto() {
        return essayDao.findWheelPhoto();
    }

    public List<Essay> searchAnthologyEssayInfoByAnthologyId(Integer essay_anthology_id) {
        return essayDao.findUserAnthologyEssayInfo(essay_anthology_id);
    }

    public Essay searchEssayById(Integer essay_id) {
        return essayDao.findEssayByEssayId(essay_id);
    }

    public List<Essay> searchEssayByUserId(Integer essay_user_id) {
        return essayDao.findEssayByUserId(essay_user_id);
    }

    public void deleteEssayById(Integer essay_id) {
        essayDao.deleteEssayById(essay_id);
    }
}
