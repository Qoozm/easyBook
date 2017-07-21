package com.xupt.bean;

/**
 * Created by colin on 2017/7/20.
 */
public class AttentionSubject {

    private Integer from_user_id;
    private Integer to_essay_id;

    public AttentionSubject() {

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
                "from_user_id=" + from_user_id +
                ", to_essay_id=" + to_essay_id +
                '}';
    }
}
