package com.xupt.dao;

import com.xupt.bean.Category;
import com.xupt.bean.Essay;

import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/14.
 */
public interface ICategoryDao {
    public void save(Category category);

    public void deleteById(Integer cid);

    public void update(Category category);

    public Category findOneById(Integer cid);

    public List<Category> findAll();
}
