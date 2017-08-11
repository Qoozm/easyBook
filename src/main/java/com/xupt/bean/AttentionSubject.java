package com.xupt.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by colin on 2017/7/20.
 */
public class AttentionSubject implements Serializable {

    private Integer attention_subject_id;
    private Integer from_user_id;
    private Integer to_essay_id;
    private Date attention_subject_date;

    public AttentionSubject() {

    }

    public Integer getAttention_subject_id() {
        return attention_subject_id;
    }

    public void setAttention_subject_id(Integer attention_subject_id) {
        this.attention_subject_id = attention_subject_id;
    }

    public Date getAttention_subject_date() {
        return attention_subject_date;
    }

    public void setAttention_subject_date(Date attention_subject_date) {
        this.attention_subject_date = attention_subject_date;
    }

    public Integer getFrom_user_id() {
        return from_user_id;
    }

    public void setFrom_user_id(Integer from_user_id) {
        this.from_user_id = from_user_id;
    }

    public Integer getTo_essay_id() {
        return to_essay_id;
    }

    public void setTo_essay_id(Integer to_essay_id) {
        this.to_essay_id = to_essay_id;
    }

    @Override
    public String toString() {
        return "AttentionSubject{" +
                "attention_subject_id=" + attention_subject_id +
                ", from_user_id=" + from_user_id +
                ", to_essay_id=" + to_essay_id +
                ", attention_subject_date=" + attention_subject_date +
                '}';
    }
}
