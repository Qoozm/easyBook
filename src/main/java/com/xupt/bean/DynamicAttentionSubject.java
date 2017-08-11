package com.xupt.bean;

import java.io.Serializable;
import java.util.Date;

public class DynamicAttentionSubject implements Serializable, Comparable {

    private Integer essay_subject_id;
    private String essay_subject_type;
    private String essay_subject_user_name;
    private String essay_subject_picture;
    private String essay_subject_describe;
    private Integer essay_subject_attention;
    private Integer essay_subject_number;
    private Date attention_subject_date;
    private final Integer dynamicType = 2;

    public DynamicAttentionSubject() {

    }

    public Integer getDynamicType() {
        return dynamicType;
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

    public String getEssay_subject_user_name() {
        return essay_subject_user_name;
    }

    public void setEssay_subject_user_name(String essay_subject_user_name) {
        this.essay_subject_user_name = essay_subject_user_name;
    }

    public String getEssay_subject_picture() {
        return essay_subject_picture;
    }

    public void setEssay_subject_picture(String essay_subject_picture) {
        this.essay_subject_picture = essay_subject_picture;
    }

    public String getEssay_subject_describe() {
        return essay_subject_describe;
    }

    public void setEssay_subject_describe(String essay_subject_describe) {
        this.essay_subject_describe = essay_subject_describe;
    }

    public Integer getEssay_subject_attention() {
        return essay_subject_attention;
    }

    public void setEssay_subject_attention(Integer essay_subject_attention) {
        this.essay_subject_attention = essay_subject_attention;
    }

    public Integer getEssay_subject_number() {
        return essay_subject_number;
    }

    public void setEssay_subject_number(Integer essay_subject_number) {
        this.essay_subject_number = essay_subject_number;
    }

    public Date getAttention_subject_date() {
        return attention_subject_date;
    }

    public void setAttention_subject_date(Date attention_subject_date) {
        this.attention_subject_date = attention_subject_date;
    }

    @Override
    public String toString() {
        return "DynamicAttentionSubject{" +
                "essay_subject_id=" + essay_subject_id +
                ", essay_subject_type='" + essay_subject_type + '\'' +
                ", essay_subject_user_name='" + essay_subject_user_name + '\'' +
                ", essay_subject_picture='" + essay_subject_picture + '\'' +
                ", essay_subject_describe='" + essay_subject_describe + '\'' +
                ", essay_subject_attention=" + essay_subject_attention +
                ", essay_subject_number=" + essay_subject_number +
                ", attention_subject_date=" + attention_subject_date +
                '}';
    }


    public int compareTo(Object o) {
        DynamicAttentionSubject dynamicAttentionSubject = (DynamicAttentionSubject) o;
        if (this.attention_subject_date.getTime() > dynamicAttentionSubject.attention_subject_date.getTime())
            return -1;
        else if (this.attention_subject_date.getTime() < dynamicAttentionSubject.attention_subject_date.getTime())
            return 1;
        else
            return 0;
    }
}
