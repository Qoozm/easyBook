package com.xupt.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by 慧乔乔 on 2017/7/13.
 */
public class Category implements Serializable {

    private Integer category_id;
    private String category_type;

    public Category() {
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    public String getCategory_type() {
        return category_type;
    }

    public void setCategory_type(String category_type) {
        this.category_type = category_type;
    }

    public String toString() {
        return "Category{" +
                "category_id=" + category_id +
                ", category_type='" + category_type + '\'' +
                '}';
    }
}
