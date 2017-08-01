package com.xupt.dao;

import com.xupt.bean.EssayCategory;

import java.util.List;

public interface IEssayCategoryDao {

    public void saveEssayCategoryDao(String category_essay_type);

    public List<EssayCategory> findHotEssayCategory();

    public List<EssayCategory> findAllEssayCategory();
}
