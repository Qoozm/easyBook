package com.xupt.dao;

import com.xupt.bean.MessageCategory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/14.
 */
@Repository
public interface IMessageCategoryDao {

    public void saveMessageCategory(String category_message_type);

    public List<MessageCategory> findAllMessageCategory();
}
