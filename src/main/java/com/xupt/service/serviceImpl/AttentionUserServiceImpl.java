package com.xupt.service.serviceImpl;

import com.xupt.bean.AttentionUser;
import com.xupt.bean.User;
import com.xupt.dao.IAttentionUserDao;
import com.xupt.dao.IUserDao;
import com.xupt.service.IAttentionUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by 慧乔乔 on 2017/7/15.
 */
@Service
public class AttentionUserServiceImpl implements IAttentionUserService {

    private String PRE_ATTENTIONUSER_TABLE_NAME = "ebattention_user_";
    private final int ATTENTION_USER_TABLE_COUNT = 5;

    @Autowired
    IAttentionUserDao attentionUserDao;

    @Autowired
    IUserDao userDao;

    public int searchWhereToSaveAttentionUser(Integer from_user_id) {
        int result;

        result = from_user_id % ATTENTION_USER_TABLE_COUNT;

        return result;
    }

    public void attentionUser(Integer from_user_id, Integer to_user_id) {
        int tableCount = searchWhereToSaveAttentionUser(from_user_id);
        String attentionUserTableName = PRE_ATTENTIONUSER_TABLE_NAME + tableCount;

        AttentionUser attentionUser = new AttentionUser();
        attentionUser.setFrom_user_id(from_user_id);
        attentionUser.setTo_user_id(to_user_id);

        attentionUserDao.saveAttentionUser(attentionUserTableName, attentionUser);
    }

    public void cancelAttention(Integer user_from_id, Integer user_to_id) {
        int tableCount = searchWhereToSaveAttentionUser(user_from_id);
        String attentionUserTableName = PRE_ATTENTIONUSER_TABLE_NAME + tableCount;

        attentionUserDao.deleteAttentionById(attentionUserTableName, user_to_id, user_from_id);
    }
}
