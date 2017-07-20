package com.xupt.bean;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 慧乔乔 on 2017/7/13.
 */
public class Message implements Serializable {

    private Integer message_id;
    private Date message_date;
    private Integer message_from_user_id;
    private Integer message_to_user_id;

    public Message() {
    }

    public Integer getMessage_id() {
        return message_id;
    }

    public void setMessage_id(Integer message_id) {
        this.message_id = message_id;
    }

    public Date getMessage_date() {
        return message_date;
    }

    public void setMessage_date(Date message_date) {
        this.message_date = message_date;
    }

    public Integer getMessage_from_user_id() {
        return message_from_user_id;
    }

    public void setMessage_from_user_id(Integer message_from_user_id) {
        this.message_from_user_id = message_from_user_id;
    }

    public Integer getMessage_to_user_id() {
        return message_to_user_id;
    }

    public void setMessage_to_user_id(Integer message_to_user_id) {
        this.message_to_user_id = message_to_user_id;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", message_date=" + message_date +
                ", message_from_user_id=" + message_from_user_id +
                ", message_to_user_id=" + message_to_user_id +
                '}';
    }
}
