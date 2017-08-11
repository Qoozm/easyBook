package com.xupt.bean;

import java.io.Serializable;
import java.util.Date;

public class DynamicThumb implements Serializable, Comparable {

    private Date thumb_date;
    private String essay_title;
    private String essay_content_path;
    private String essay_content;
    private String essay_user_name;
    private Integer essay_visits;
    private Integer essay_thumb;
    private Integer essay_comment_number;
    private Integer essay_id;
    private final Integer dynamicType = 4;

    public DynamicThumb() {

    }

    public Integer getDynamicType() {
        return dynamicType;
    }

    public Date getThumb_date() {
        return thumb_date;
    }

    public void setThumb_date(Date thumb_date) {
        this.thumb_date = thumb_date;
    }

    public String getEssay_title() {
        return essay_title;
    }

    public void setEssay_title(String essay_title) {
        this.essay_title = essay_title;
    }

    public String getEssay_content_path() {
        return essay_content_path;
    }

    public void setEssay_content_path(String essay_content_path) {
        this.essay_content_path = essay_content_path;
    }

    public String getEssay_content() {
        return essay_content;
    }

    public void setEssay_content(String essay_content) {
        this.essay_content = essay_content;
    }

    public String getEssay_user_name() {
        return essay_user_name;
    }

    public void setEssay_user_name(String essay_user_name) {
        this.essay_user_name = essay_user_name;
    }

    public Integer getEssay_visits() {
        return essay_visits;
    }

    public void setEssay_visits(Integer essay_visits) {
        this.essay_visits = essay_visits;
    }

    public Integer getEssay_thumb() {
        return essay_thumb;
    }

    public void setEssay_thumb(Integer essay_thumb) {
        this.essay_thumb = essay_thumb;
    }

    public Integer getEssay_comment_number() {
        return essay_comment_number;
    }

    public void setEssay_comment_number(Integer essay_comment_number) {
        this.essay_comment_number = essay_comment_number;
    }

    public Integer getEssay_id() {
        return essay_id;
    }

    public void setEssay_id(Integer essay_id) {
        this.essay_id = essay_id;
    }

    @Override
    public String toString() {
        return "DynamicThumb{" +
                "thumb_date=" + thumb_date +
                ", essay_title='" + essay_title + '\'' +
                ", essay_content_path='" + essay_content_path + '\'' +
                ", essay_user_name='" + essay_user_name + '\'' +
                ", essay_visits=" + essay_visits +
                ", essay_thumb=" + essay_thumb +
                ", essay_comment_number=" + essay_comment_number +
                ", essay_id=" + essay_id +
                '}';
    }

    public int compareTo(Object o) {
        DynamicThumb dynamicThumb = (DynamicThumb) o;
        if (this.thumb_date.getTime() > dynamicThumb.thumb_date.getTime())
            return -1;
        else if (this.thumb_date.getTime() < dynamicThumb.thumb_date.getTime())
            return 1;
        else
            return 0;
    }
}
