package com.xupt.service.serviceImpl;

import com.xupt.bean.EssaySubject;
import com.xupt.dao.IEssaySubjectDao;
import com.xupt.service.IEssaySubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EssaySubjectServiceImpl implements IEssaySubjectService {

    private final IEssaySubjectDao essaySubjectDao;

    @Autowired
    public EssaySubjectServiceImpl(IEssaySubjectDao essayCategoryDao) {
        this.essaySubjectDao = essayCategoryDao;
    }

    public List<EssaySubject> loadHotSubject() {
        List<EssaySubject> essaySubjects = essaySubjectDao.findHotEssaySubject();
        return  essaySubjects;
    }
}
