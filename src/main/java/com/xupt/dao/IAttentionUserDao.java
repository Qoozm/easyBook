package com.xupt.dao;

import com.xupt.bean.AttentionUser;
import com.xupt.bean.DynamicAttentionUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
public interface IAttentionUserDao {

    public void saveAttentionUser(@Param("attentionUserTableName") String attentionUserTableName,
                                  @Param("attention") AttentionUser attention);

    public void deleteAttentionById(@Param("attentionUserTableName") String attentionUserTableName,
                                    @Param("toUserId") Integer toUserId,
                                    @Param("fromUserId") Integer fromUserId);

    public List<DynamicAttentionUser> selectDynamicAttentionUser(@Param("attentionUserTableName") String attentionUserTableName,
                                                                 @Param("from_user_id") Integer from_user_id);
}
