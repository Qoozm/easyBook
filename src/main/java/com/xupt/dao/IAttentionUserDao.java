package com.xupt.dao;

import com.xupt.bean.AttentionUser;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
public interface IAttentionUserDao {

    public void saveAttentionUser(@Param("attentionTableName") String attentionTableName, @Param("attention") AttentionUser attention);

    public void deleteAttentionById(@Param("attentionTableName") String attentionTableName, @Param("toUserId") Integer toUserId, @Param("fromUserId") Integer fromUserId);
}
