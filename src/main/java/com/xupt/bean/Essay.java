package com.xupt.bean;

import java.io.Serializable;
import java.util.Date;


/**
 * Created by colin on 2017/7/13.
 */
public class Essay implements Serializable {

    private Integer essay_id;
    private String essay_title;
    private Integer essay_user_id;
    private String essay_content_path;
    private Date essay_pubDate;
    private Integer essay_visits;
    private Integer essay_thumb;
    private Integer essay_subject_id;
    private Integer essay_anthology_id;
    private Integer essay_comment_number;
    private String essay_content;
    private Integer essay_photo;

    public Essay() {

    }

    public Integer getEssay_comment_number() {
        return essay_comment_number;
    }

    public void setEssay_comment_number(Integer essay_comment_number) {
        this.essay_comment_number = essay_comment_number;
    }

    public Integer getEssay_photo() {
        return essay_photo;
    }

    public void setEssay_photo(Integer essay_photo) {
        this.essay_photo = essay_photo;
    }

    public Integer getEssay_id() {
        return essay_id;
    }

    public void setEssay_id(Integer essay_id) {
        this.essay_id = essay_id;
    }

    public String getEssay_title() {
        return essay_title;
    }

    public void setEssay_title(String essay_title) {
        this.essay_title = essay_title;
    }

    public Integer getEssay_user_id() {
        return essay_user_id;
    }

    public void setEssay_user_id(Integer essay_user_id) {
        this.essay_user_id = essay_user_id;
    }

    public String getEssay_content_path() {
        return essay_content_path;
    }

    public void setEssay_content_path(String essay_content_path) {
        this.essay_content_path = essay_content_path;
    }

    public Date getEssay_pubDate() {
        return essay_pubDate;
    }

    public void setEssay_pubDate(Date essay_pubDate) {
        this.essay_pubDate = essay_pubDate;
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

    public Integer getEssay_subject_id() {
        return essay_subject_id;
    }

    public void setEssay_subject_id(Integer essay_subject_id) {
        this.essay_subject_id = essay_subject_id;
    }

    public Integer getEssay_anthology_id() {
        return essay_anthology_id;
    }

    public void setEssay_anthology_id(Integer essay_anthology_id) {
        this.essay_anthology_id = essay_anthology_id;
    }

    public String getEssay_content() {
        return essay_content;
    }

    public void setEssay_content(String essay_content) {
        this.essay_content = essay_content;
    }

    @Override
    public String toString() {
        return "Essay{" +
                "essay_id=" + essay_id +
                ", essay_title='" + essay_title + '\'' +
                ", essay_user_id=" + essay_user_id +
                ", essay_content_path='" + essay_content_path + '\'' +
                ", essay_pubDate=" + essay_pubDate +
                ", essay_visits=" + essay_visits +
                ", essay_thumb=" + essay_thumb +
                ", essay_subject_id=" + essay_subject_id +
                ", essay_anthology_id=" + essay_anthology_id +
                ", essay_comment_number=" + essay_comment_number +
                ", essay_photo=" + essay_photo +
                '}';
    }
}
