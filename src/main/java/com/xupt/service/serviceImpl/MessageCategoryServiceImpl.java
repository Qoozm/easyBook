package com.xupt.service.serviceImpl;

import com.xupt.bean.MessageCategory;
import com.xupt.dao.IMessageCategoryDao;
import com.xupt.service.IMessageCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
@Service
public class MessageCategoryServiceImpl implements IMessageCategoryService {
    @Autowired
    IMessageCategoryDao messageCategoryDao;
    public void save(MessageCategory messageCategory) {

    }

    public void deleteById(Integer category_message_id) {

    }

    public void update(MessageCategory messageCategory) {

    }

    public MessageCategory findOneById(Integer category_message_id) {
        return null;
    }

    public List<MessageCategory> findAll() {
        return null;
    }
}
