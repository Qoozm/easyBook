package com.xupt.bean;

import java.io.Serializable;

public class EssayCategory implements Serializable {

    private Integer category_essay_id;
    private String category_essay_type;
    private Integer category_essay_user_id;
    private String category_essay_picture;
    private String category_essay_describe;
    private Integer category_essay_attention;
    private Integer category_essay_number;

    public EssayCategory() {

    }

    public Integer getCategory_essay_attention() {
        return category_essay_attention;
    }

    public void setCategory_essay_attention(Integer category_essay_attention) {
        this.category_essay_attention = category_essay_attention;
    }

    public Integer getCategory_essay_number() {
        return category_essay_number;
    }

    public void setCategory_essay_number(Integer category_essay_number) {
        this.category_essay_number = category_essay_number;
    }

    public Integer getCategory_essay_id() {
        return category_essay_id;
    }

    public void setCategory_essay_id(Integer category_essay_id) {
        this.category_essay_id = category_essay_id;
    }

    public String getCategory_essay_type() {
        return category_essay_type;
    }

    public void setCategory_essay_type(String category_essay_type) {
        this.category_essay_type = category_essay_type;
    }

    public Integer getCategory_essay_user_id() {
        return category_essay_user_id;
    }

    public void setCategory_essay_user_id(Integer category_essay_user_id) {
        this.category_essay_user_id = category_essay_user_id;
    }

    public String getCategory_essay_picture() {
        return category_essay_picture;
    }

    public void setCategory_essay_picture(String category_essay_picture) {
        this.category_essay_picture = category_essay_picture;
    }

    public String getCategory_essay_describe() {
        return category_essay_describe;
    }

    public void setCategory_essay_describe(String category_essay_describe) {
        this.category_essay_describe = category_essay_describe;
    }

    @Override
    public String toString() {
        return "EssayCategory{" +
                "category_essay_id=" + category_essay_id +
                ", category_essay_type='" + category_essay_type + '\'' +
                ", category_essay_user_id=" + category_essay_user_id +
                ", category_essay_picture='" + category_essay_picture + '\'' +
                ", category_essay_describe='" + category_essay_describe + '\'' +
                ", category_essay_attention=" + category_essay_attention +
                ", category_essay_essaynumber=" + category_essay_number +
                '}';
    }
}
