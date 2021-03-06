package com.xupt.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by 慧乔乔 on 2017/7/13.
 */
public class User implements Serializable {

    private Integer user_id;
    private String user_phone;
    private String user_name;
    private String user_email;
    private String user_password;
    private Integer user_fans;
    private Integer user_essay_thumb;
    private String user_head_icon_path;
    private String user_sex;
    private String user_description;
    private Integer user_age;
    private Integer user_essay_number;

    public User() {

    }

    public Integer getUser_essay_number() {
        return user_essay_number;
    }

    public void setUser_essay_number(Integer user_essay_number) {
        this.user_essay_number = user_essay_number;
    }

    public String getUser_head_icon_path() {
        return user_head_icon_path;
    }

    public void setUser_head_icon_path(String user_head_icon_path) {
        this.user_head_icon_path = user_head_icon_path;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getUser_essay_thumb() {
        return user_essay_thumb;
    }

    public void setUser_essay_thumb(Integer user_essay_thumb) {
        this.user_essay_thumb = user_essay_thumb;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public Integer getUser_fans() {
        return user_fans;
    }

    public void setUser_fans(Integer user_fans) {
        this.user_fans = user_fans;
    }

    public String getUser_sex() {
        return user_sex;
    }

    public void setUser_sex(String user_sex) {
        this.user_sex = user_sex;
    }

    public String getUser_description() {
        return user_description;
    }

    public void setUser_description(String user_description) {
        this.user_description = user_description;
    }

    public Integer getUser_age() {
        return user_age;
    }

    public void setUser_age(Integer user_age) {
        this.user_age = user_age;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", user_phone='" + user_phone + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_email='" + user_email + '\'' +
                ", user_password='" + user_password + '\'' +
                ", user_fans=" + user_fans +
                ", user_essay_thumb=" + user_essay_thumb +
                ", user_head_icon_path='" + user_head_icon_path + '\'' +
                ", user_sex='" + user_sex + '\'' +
                ", user_description='" + user_description + '\'' +
                ", user_age=" + user_age +
                ", user_essay_number=" + user_essay_number +
                '}';
    }
}
