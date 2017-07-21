package com.xupt.dao;

import com.xupt.bean.AttentionUser;
import org.apache.ibatis.annotations.Param;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
public interface IAttentionUserDao {

    public void saveAttentionUser(@Param("attentionUserTableName") String attentionUserTableName, @Param("attention") AttentionUser attention);

    public void deleteAttentionById(@Param("attentionUserTableName") String attentionUserTableName, @Param("toUserId") Integer toUserId, @Param("fromUserId") Integer fromUserId);
}
