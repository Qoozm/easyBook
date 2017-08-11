package com.xupt.bean;

import java.io.Serializable;
import java.util.Date;

public class HomePageEssay implements Serializable {
    private Integer user_id;
    private Integer essay_id;
    private Integer essay_subject_id;
    private String essay_subject_type;
    private String user_name;
    private String user_head_icon_path;
    private Date essay_pubDate;
    private String essay_title;
    private String essay_content_path;
    private String essay_content;
    private Integer essay_visits;
    private Integer essay_thumb;
    private Integer essay_comment_number;

    public HomePageEssay() {

    }

    public String getEssay_content() {
        return essay_content;
    }

    public void setEssay_content(String essay_content) {
        this.essay_content = essay_content;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getEssay_id() {
        return essay_id;
    }

    public void setEssay_id(Integer essay_id) {
        this.essay_id = essay_id;
    }

    public Integer getEssay_subject_id() {
        return essay_subject_id;
    }

    public void setEssay_subject_id(Integer essay_subject_id) {
        this.essay_subject_id = essay_subject_id;
    }

    public String getEssay_subject_type() {
        return essay_subject_type;
    }

    public void setEssay_subject_type(String essay_subject_type) {
        this.essay_subject_type = essay_subject_type;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_head_icon_path() {
        return user_head_icon_path;
    }

    public void setUser_head_icon_path(String user_head_icon_path) {
        this.user_head_icon_path = user_head_icon_path;
    }

    public Date getEssay_pubDate() {
        return essay_pubDate;
    }

    public void setEssay_pubDate(Date essay_pubDate) {
        this.essay_pubDate = essay_pubDate;
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

    @Override
    public String toString() {
        return "HomePageEssay{" +
                "user_id=" + user_id +
                ", essay_id=" + essay_id +
                ", essay_subject_id=" + essay_subject_id +
                ", essay_subject_type='" + essay_subject_type + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_head_icon_path='" + user_head_icon_path + '\'' +
                ", essay_pubDate=" + essay_pubDate +
                ", essay_title='" + essay_title + '\'' +
                ", essay_content_path='" + essay_content_path + '\'' +
                ", essay_visits=" + essay_visits +
                ", essay_thumb=" + essay_thumb +
                ", essay_comment_number=" + essay_comment_number +
                '}';
    }
}
