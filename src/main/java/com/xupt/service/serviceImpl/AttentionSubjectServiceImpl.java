package com.xupt.service.serviceImpl;

import com.xupt.dao.IAttentionSubjectDao;
import com.xupt.service.IAttentionSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by colin on 2017/7/20.
 */
@Service
public class AttentionSubjectServiceImpl implements IAttentionSubjectService {

    private final int ATTENTION_SUBJECT_TABLE_COUNT = 5;
    private String PRE_ATTENTION_SUBJECT_TABLE_NAME = "ebattention_subject_";

    @Autowired
    IAttentionSubjectDao attentionSubjectDao;

    public int searchWhereToSaveAttentionSubject(Integer from_user_id) {
        int result;

        result = from_user_id % ATTENTION_SUBJECT_TABLE_COUNT;

        return result;
    }

    public void attentionSubject(Integer from_user_id, Integer to_essay_id) {
        int tableCount = searchWhereToSaveAttentionSubject(from_user_id);
        String attentionSubjectTableName = PRE_ATTENTION_SUBJECT_TABLE_NAME + tableCount;

        attentionSubjectDao.saveAttentionSubject(attentionSubjectTableName, from_user_id, to_essay_id);
    }

    public void cancelAttentionSubject(Integer from_user_id, Integer to_essay_id) {
        int tableCount = searchWhereToSaveAttentionSubject(from_user_id);
        String attentionSubjectTableName = PRE_ATTENTION_SUBJECT_TABLE_NAME + tableCount;

        attentionSubjectDao.deleteAttentionSubject(attentionSubjectTableName, from_user_id, to_essay_id);
    }
}
