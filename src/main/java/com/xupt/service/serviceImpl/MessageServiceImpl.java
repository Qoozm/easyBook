package com.xupt.service.serviceImpl;

import com.xupt.bean.Message;
import com.xupt.bean.MessageCategory;
import com.xupt.dao.IMessageCategoryDao;
import com.xupt.dao.IMessageDao;
import com.xupt.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
@Service
public class MessageServiceImpl implements IMessageService {

    private final int MESSAGE_TABLE_COUNT = 5;
    private String PRE_MESSAGE_TABLE_NAME = "ebmessage_";

    private final IMessageDao messageDao;

    private final IMessageCategoryDao categoryDao;

    @Autowired
    public MessageServiceImpl(IMessageDao messageDao, IMessageCategoryDao categoryDao) {
        this.messageDao = messageDao;
        this.categoryDao = categoryDao;
    }

    public int searchWhereToSaveMessage(Integer message_to_user_id) {
        int result;

        result = message_to_user_id % MESSAGE_TABLE_COUNT;

        return result;
    }

    public void setMessageCategoryMap() {

        Message.MessageCategory.clear();
        List<MessageCategory> messageCategories = categoryDao.findAllMessageCategory();

        for (MessageCategory messageCategory : messageCategories) {
            Message.MessageCategory.put(messageCategory.getCategory_message_type(), messageCategory.getCategory_message_id());
        }

    }

    //当前用户每次接受到一个消息，都调用该方法将消息的状态设置为未发送的状态并将其保存到数据库中
    public void saveMessage(Integer message_from_user_id,
                            Integer message_to_user_id,
                            String message_content,
                            Integer messageTypeId) {

        int tableCount = searchWhereToSaveMessage(message_to_user_id);
        String messageTableName = PRE_MESSAGE_TABLE_NAME + tableCount;

        Message message = new Message();
        message.setMessage_content(message_content);
        message.setMessage_date(new Date());
        message.setMessage_from_user_id(message_from_user_id);
        message.setMessage_to_user_id(message_to_user_id);
        message.setMessage_status(Message.NOT_SEND_MESSAGE);
        message.setMessage_type_id(messageTypeId);

        messageDao.saveMessage(messageTableName, message);
    }

    //找到用户所有未投递的信息
    public List<Message> sendMessage(Integer message_to_user_id) {

        int tableCount = searchWhereToSaveMessage(message_to_user_id);
        String messageTableName = PRE_MESSAGE_TABLE_NAME + tableCount;

        return messageDao.findMessageNotSend(messageTableName, message_to_user_id, Message.NOT_SEND_MESSAGE);
    }
}
