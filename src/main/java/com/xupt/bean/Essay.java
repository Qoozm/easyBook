package com.xupt.bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by colin on 2017/7/13.
 */
public class Essay implements Serializable {

    private Integer essay_id;
    private String essay_title;
    private Integer essay_user_id;
    private byte[] essay_content;
    private Date essay_pubDate;
    private Integer essay_visits;
    private Integer essay_thumb;
    private Integer essay_category_id;
    private Integer essay_anthology_id;

    public Essay() {

    }

    public Integer getEssay_anthology_id() {
        return essay_anthology_id;
    }

    public void setEssay_anthology_id(Integer essay_anthology_id) {
        this.essay_anthology_id = essay_anthology_id;
    }

    public Integer getEssay_category_id() {
        return essay_category_id;
    }

    public void setEssay_category_id(Integer essay_category_id) {
        this.essay_category_id = essay_category_id;
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

    public byte[] getEssay_content() {
        return essay_content;
    }

    public void setEssay_content(byte[] essay_content) {
        this.essay_content = essay_content;
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

    @Override
    public String toString() {
        return "Essay{" +
                "essay_id=" + essay_id +
                ", essay_title='" + essay_title + '\'' +
                ", essay_user_id=" + essay_user_id +
                ", essay_content=" + Arrays.toString(essay_content) +
                ", essay_pubDate=" + essay_pubDate +
                ", essay_visits=" + essay_visits +
                ", essay_thumb=" + essay_thumb +
                ", essay_category_id=" + essay_category_id +
                ", essay_anthology_id=" + essay_anthology_id +
                '}';
    }
}
