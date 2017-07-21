package com.xupt.service;


/**
 * Created by 慧乔乔 on 2017/7/15.
 */
public interface IAttentionUserService {

    public int searchWhereToSaveAttentionUser(Integer from_user_id);

    public void attentionUser(Integer user_from_id, Integer user_to_id);

    public void cancelAttention(Integer user_from_id, Integer user_to_id);
}
