package com.xupt.service;

import com.xupt.bean.User;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
public interface IAttentionUserService {

    public int searchWhereToSaveAttentionUser(Integer from_user_id);

    public void attentionUser(Integer user_from_id, Integer user_to_id);

    public void removeAttention(Integer user_from_id, Integer user_to_id);
}
