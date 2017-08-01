package com.xupt.bean;

import java.io.Serializable;

public class Thumb implements Serializable {

    private Integer thumb_user_id;
    private Integer thumb_essay_id;

    public Thumb() {

    }

    public Integer getThumb_user_id() {
        return thumb_user_id;
    }

    public void setThumb_user_id(Integer thumb_user_id) {
        this.thumb_user_id = thumb_user_id;
    }

    public Integer getThumb_essay_id() {
        return thumb_essay_id;
    }

    public void setThumb_essay_id(Integer thumb_essay_id) {
        this.thumb_essay_id = thumb_essay_id;
    }

    @Override
    public String toString() {
        return "Thumb{" +
                "thumb_user_id=" + thumb_user_id +
                ", thumb_essay_id=" + thumb_essay_id +
                '}';
    }
}
