package com.xupt.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by colin on 2017/7/15.
 */
public class Comment implements Serializable {

    private String comment_content;
    private Integer comment_id;
    private Integer to_comment_id;
    private Integer comment_from_user_id;
    private Integer comment_thumb;
    private Integer comment_essay_id;
    private Integer comment_to_user_id;
    private Integer comment_floor;
    private Date comment_date;

    public Comment() {

    }

    public Integer getTo_comment_id() {
        return to_comment_id;
    }

    public void setTo_comment_id(Integer to_comment_id) {
        this.to_comment_id = to_comment_id;
    }

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public Integer getComment_from_user_id() {
        return comment_from_user_id;
    }

    public void setComment_from_user_id(Integer comment_from_user_id) {
        this.comment_from_user_id = comment_from_user_id;
    }

    public Integer getComment_thumb() {
        return comment_thumb;
    }

    public void setComment_thumb(Integer comment_thumb) {
        this.comment_thumb = comment_thumb;
    }

    public Integer getComment_essay_id() {
        return comment_essay_id;
    }

    public void setComment_essay_id(Integer comment_essay_id) {
        this.comment_essay_id = comment_essay_id;
    }

    public Integer getComment_to_user_id() {
        return comment_to_user_id;
    }

    public void setComment_to_user_id(Integer comment_to_user_id) {
        this.comment_to_user_id = comment_to_user_id;
    }

    public Integer getComment_floor() {
        return comment_floor;
    }

    public void setComment_floor(Integer comment_floor) {
        this.comment_floor = comment_floor;
    }

    public Date getComment_date() {
        return comment_date;
    }

    public void setComment_date(Date comment_date) {
        this.comment_date = comment_date;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment_content=" + comment_content +
                ", comment_id=" + comment_id +
                ", to_comment_id=" + to_comment_id +
                ", comment_from_user_id=" + comment_from_user_id +
                ", comment_thumb=" + comment_thumb +
                ", comment_essay_id=" + comment_essay_id +
                ", comment_to_user_id=" + comment_to_user_id +
                ", comment_floor=" + comment_floor +
                ", comment_date=" + comment_date +
                '}';
    }
}