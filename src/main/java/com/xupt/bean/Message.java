package com.xupt.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 慧乔乔 on 2017/7/13.
 */
public class Message implements Serializable {

    private Integer message_id;
    private Date message_date;
    private Integer message_from_user_id;
    private Integer message_to_user_id;
    private Integer message_type_id;
    private Integer message_status;
    private String message_content;

    public static Map<String, Integer> MessageCategory = new HashMap<String, Integer>();
    public final static int NOT_SEND_MESSAGE = 0;
    public final static int ALREADY_SEND_MESSAGE = 1;

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

    public Integer getMessage_type_id() {
        return message_type_id;
    }

    public void setMessage_type_id(Integer message_type_id) {
        this.message_type_id = message_type_id;
    }

    public Integer getMessage_status() {
        return message_status;
    }

    public void setMessage_status(Integer message_status) {
        this.message_status = message_status;
    }

    public String getMessage_content() {
        return message_content;
    }

    public void setMessage_content(String message_content) {
        this.message_content = message_content;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", message_date=" + message_date +
                ", message_from_user_id=" + message_from_user_id +
                ", message_to_user_id=" + message_to_user_id +
                ", message_type_id=" + message_type_id +
                ", message_status=" + message_status +
                ", message_connent='" + message_content + '\'' +
                '}';
    }
}
