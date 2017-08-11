package com.xupt.bean;

import java.io.Serializable;
import java.util.Date;

public class DynamicComment implements Serializable, Comparable {
    private String comment_content;
    private Date comment_date;
    private String essay_title;
    private String essay_content;
    private Integer essay_visits;
    private Integer essay_comment_number;
    private Integer essay_thumb;
    private String comment_to_user_name;
    private String essay_content_path;
    private final Integer dynamicType = 3;

    public DynamicComment() {

    }

    public Integer getDynamicType() {
        return dynamicType;
    }

    public String getEssay_content_path() {
        return essay_content_path;
    }

    public void setEssay_content_path(String essay_content_path) {
        this.essay_content_path = essay_content_path;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public Date getComment_date() {
        return comment_date;
    }

    public void setComment_date(Date comment_date) {
        this.comment_date = comment_date;
    }

    public String getEssay_title() {
        return essay_title;
    }

    public void setEssay_title(String essay_title) {
        this.essay_title = essay_title;
    }

    public String getEssay_content() {
        return essay_content;
    }

    public void setEssay_content(String essay_content) {
        this.essay_content = essay_content;
    }

    public Integer getEssay_visits() {
        return essay_visits;
    }

    public void setEssay_visits(Integer essay_visits) {
        this.essay_visits = essay_visits;
    }

    public Integer getEssay_comment_number() {
        return essay_comment_number;
    }

    public void setEssay_comment_number(Integer essay_comment_number) {
        this.essay_comment_number = essay_comment_number;
    }

    public Integer getEssay_thumb() {
        return essay_thumb;
    }

    public void setEssay_thumb(Integer essay_thumb) {
        this.essay_thumb = essay_thumb;
    }

    public String getComment_to_user_name() {
        return comment_to_user_name;
    }

    public void setComment_to_user_name(String comment_to_user_name) {
        this.comment_to_user_name = comment_to_user_name;
    }

    @Override
    public String toString() {
        return "DynamicComment{" +
                "comment_content='" + comment_content + '\'' +
                ", comment_date=" + comment_date +
                ", essay_title='" + essay_title + '\'' +
                ", essay_visits=" + essay_visits +
                ", essay_comment_number=" + essay_comment_number +
                ", essay_thumb=" + essay_thumb +
                ", comment_to_user_name='" + comment_to_user_name + '\'' +
                ", essay_content_path='" + essay_content_path + '\'' +
                '}';
    }

    public int compareTo(Object o) {
        DynamicComment dynamicComment = (DynamicComment) o;
        if (this.comment_date.getTime() > dynamicComment.comment_date.getTime())
            return -1;
        else if (this.comment_date.getTime() < dynamicComment.comment_date.getTime())
            return 1;
        else
            return 0;
    }
}
