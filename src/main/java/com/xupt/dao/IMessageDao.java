package com.xupt.dao;

import com.xupt.bean.Message;

import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/14.
 */
public interface IMessageDao {
    public void save(Message message);

    public void deleteById(Integer mid);

    public void update(Message message);

    public Message findOneById(Integer mid);

    public List<Message> findAll();
}
