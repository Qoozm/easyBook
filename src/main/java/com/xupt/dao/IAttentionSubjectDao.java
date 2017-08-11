package com.xupt.dao;

import com.xupt.bean.DynamicAttentionSubject;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    public List<DynamicAttentionSubject> selectAttentionSubject(@Param("attentionSubjectTableName") String attentionSubjectTableName,
                                                               @Param("from_user_id") Integer from_user_id);
}
