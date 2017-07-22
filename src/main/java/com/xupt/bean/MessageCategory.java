package com.xupt.bean;

import java.io.Serializable;

/**
 * Created by 慧乔乔 on 2017/7/16.
 */
public class MessageCategory implements Serializable{

    private Integer category_message_id;
    private String category_message_type;

    public MessageCategory() {
    }

    public Integer getCategory_message_id() {
        return category_message_id;
    }

    public void setCategory_message_id(Integer category_message_id) {
        this.category_message_id = category_message_id;
    }

    public String getCategory_message_type() {
        return category_message_type;
    }

    public void setCategory_message_type(String category_message_type) {
        this.category_message_type = category_message_type;
    }

    @Override
    public String toString() {
        return "MessageCategory{" +
                "category_message_id=" + category_message_id +
                ", category_message_type='" + category_message_type + '\'' +
                '}';
    }
}
