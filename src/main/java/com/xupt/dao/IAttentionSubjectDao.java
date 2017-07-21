package com.xupt.dao;

import org.apache.ibatis.annotations.Param;

/**
 * Created by colin on 2017/7/20.
 */
public interface IAttentionSubjectDao {

    public void saveAttentionSubject(@Param("attentionSubjectTableName") String attentionSubjectTableName,
                                        @Param("from_user_id") Integer from_user_id,
                                        @Param("to_essay_id") Integer to_essay_id);

    public void deleteAttentionSubject(@Param("attentionSubjectTableName") String attentionSubjectTableName,
                                       @Param("from_user_id") Integer from_user_id,
                                       @Param("to_essay_id") Integer to_essay_id);
}
