package com.xupt.bean;

import java.io.Serializable;

public class EssaySubject implements Serializable {

    private Integer essay_subject_id;
    private String essay_subject_type;
    private Integer essay_subject_user_id;
    private String essay_subject_picture;
    private String essay_subject_describe;
    private Integer essay_subject_attention;
    private Integer essay_subject_number;

    public EssaySubject() {

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

    public Integer getEssay_subject_user_id() {
        return essay_subject_user_id;
    }

    public void setEssay_subject_user_id(Integer essay_subject_user_id) {
        this.essay_subject_user_id = essay_subject_user_id;
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

    @Override
    public String toString() {
        return "EssaySubject{" +
                "essay_subject_id=" + essay_subject_id +
                ", essay_subject_type='" + essay_subject_type + '\'' +
                ", essay_subject_user_id=" + essay_subject_user_id +
                ", essay_subject_picture='" + essay_subject_picture + '\'' +
                ", essay_subject_describe='" + essay_subject_describe + '\'' +
                ", essay_subject_attention=" + essay_subject_attention +
                ", essay_subject_number=" + essay_subject_number +
                '}';
    }
}
