package com.xupt.bean;

import java.io.Serializable;
import java.util.Date;

public class DynamicAttentionUser implements Serializable, Comparable {
    private Integer user_id;
    private String user_name;
    private String user_description;
    private Integer user_fans;
    private Integer user_essay_number;
    private Date attention_user_date;
    private final Integer dynamicType = 1;

    public DynamicAttentionUser() {

    }

    public Integer getDynamicType() {
        return dynamicType;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_description() {
        return user_description;
    }

    public void setUser_description(String user_description) {
        this.user_description = user_description;
    }

    public Integer getUser_fans() {
        return user_fans;
    }

    public void setUser_fans(Integer user_fans) {
        this.user_fans = user_fans;
    }

    public Integer getUser_essay_number() {
        return user_essay_number;
    }

    public void setUser_essay_number(Integer user_essay_number) {
        this.user_essay_number = user_essay_number;
    }

    public Date getAttention_user_date() {
        return attention_user_date;
    }

    public void setAttention_user_date(Date attention_user_date) {
        this.attention_user_date = attention_user_date;
    }

    @Override
    public String toString() {
        return "DynamicAteentionUser{" +
                "user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", user_description='" + user_description + '\'' +
                ", user_fans=" + user_fans +
                ", user_essay_number=" + user_essay_number +
                ", attention_user_date=" + attention_user_date +
                '}';
    }

    public int compareTo(Object o) {
        DynamicAttentionUser dynamicAttentionUser = (DynamicAttentionUser) o;
        if (this.attention_user_date.getTime() > dynamicAttentionUser.attention_user_date.getTime())
            return -1;
        else if (this.attention_user_date.getTime() < dynamicAttentionUser.attention_user_date.getTime())
            return 1;
        else
            return 0;
    }
}
