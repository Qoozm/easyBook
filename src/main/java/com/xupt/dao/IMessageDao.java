package com.xupt.dao;

import com.xupt.bean.Message;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/14.
 */
public interface IMessageDao {

    public void saveMessage(@Param("messageTable") String messageTable,
                            @Param("message") Message message);

    public void deleteMessageById(@Param("messageTable") String messageTable,
                                  @Param("message_id") Integer message_id);

    public void updateMessageStatus(@Param("messageTable") String messageTable,
                                    @Param("message_id") Integer message_id,
                                    @Param("message_status") Integer message_status);

    public List<Message> findMessageNotSend(@Param("messageTable") String messageTable,
                                      @Param("message_to_user_id") Integer message_to_user_id,
                                      @Param("message_status") Integer message_status);

    public List<Message> findMessageBySendUserId(@Param("messageTable") String messageTable,
                                                 @Param("message_from_user_id") Integer message_from_user_id);
}
