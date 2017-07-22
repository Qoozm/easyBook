package com.xupt.service;

import com.xupt.bean.Message;

import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
public interface IMessageService {

    public int searchWhereToSaveMessage(Integer message_to_user_id);

    public void setMessageCategoryMap();

    public void saveMessage(Integer message_from_user_id, Integer message_to_user_id, String message_content, Integer messageType);

    public List<Message> sendMessage(Integer message_to_user_id);
}
