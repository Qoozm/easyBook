package com.xupt.service.serviceImpl;

import com.xupt.bean.Message;
import com.xupt.service.IMessageService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by colin on 2017/7/16.
 */
@Service
public class MessageServiceImpl implements IMessageService {
    public void saveMessage(Integer message_from_user_id, Integer message_to_user_id, String message_content, String messageType) {

    }

    public List<Message> getAllMessage(Integer message_from_user_id, Integer message_to_user_id) {
        return null;
    }

    public boolean isHaveNewMessage(Integer message_to_id) {
        return false;
    }
}
