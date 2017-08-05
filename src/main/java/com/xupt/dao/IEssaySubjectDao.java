package com.xupt.dao;

import com.xupt.bean.EssaySubject;

import java.util.List;

public interface IEssaySubjectDao {

    public void saveEssaySubjectDao(String essay_subject_type);

    public List<EssaySubject> findHotEssaySubject();

    public List<EssaySubject> findAllEssaySubject();
}
