package com.xupt.bean;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
public class AttentionUser implements Serializable {

    private Integer attention_id;
    private Integer from_user_id;
    private Integer to_user_id;
    private Date attention_user_date;

    public AttentionUser() {

    }

    public Date getAttention_user_date() {
        return attention_user_date;
    }

    public void setAttention_user_date(Date attention_user_date) {
        this.attention_user_date = attention_user_date;
    }

    public Integer getAttention_id() {
        return attention_id;
    }

    public void setAttention_id(Integer attention_id) {
        this.attention_id = attention_id;
    }

    public Integer getFrom_user_id() {
        return from_user_id;
    }

    public void setFrom_user_id(Integer from_user_id) {
        this.from_user_id = from_user_id;
    }

    public Integer getTo_user_id() {
        return to_user_id;
    }

    public void setTo_user_id(Integer to_user_id) {
        this.to_user_id = to_user_id;
    }

    @Override
    public String toString() {
        return "AttentionUser{" +
                "attention_id=" + attention_id +
                ", from_user_id=" + from_user_id +
                ", to_user_id=" + to_user_id +
                ", attention_user_date=" + attention_user_date +
                '}';
    }
}
