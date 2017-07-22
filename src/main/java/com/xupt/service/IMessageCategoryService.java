package com.xupt.service;

import com.xupt.bean.MessageCategory;

import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
public interface IMessageCategoryService {

    public void save(MessageCategory messageCategory);

    public void deleteById(Integer category_message_id);

    public void update(MessageCategory messageCategory);

    public MessageCategory findOneById(Integer category_message_id);

    public List<MessageCategory> findAll();
}
