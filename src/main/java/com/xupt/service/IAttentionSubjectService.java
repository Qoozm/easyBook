package com.xupt.service;

import com.xupt.bean.DynamicAttentionSubject;

import java.util.List;

/**
 * Created by colin on 2017/7/20.
 */
public interface IAttentionSubjectService {

    public int searchWhereToSaveAttentionSubject(Integer from_user_id);

    public void attentionSubject(Integer from_user_id, Integer to_essay_id);

    public void cancelAttentionSubject(Integer from_user_id, Integer to_essay_id);

    public List<DynamicAttentionSubject> searchUserDynamicAttentionSubject(Integer from_user_id);
}
