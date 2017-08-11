package com.xupt.dao;

import com.xupt.bean.Comment;
import com.xupt.bean.DynamicComment;
import com.xupt.bean.Essay;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by colin on 2017/7/15.
 */
public interface ICommentDao {

    public void saveComment(@Param("commentTableName") String commentTableName,
                            @Param("comment") Comment comment);

    public void deleteByEssayId(@Param("commentTableName") String commentTableName,
                                @Param("essayId") Integer essayId);

    public void deleteByCommentId(@Param("commentTableName") String commentTableName,
                                  @Param("commentId") Integer commentId);

    public void deleteByToCommentId(@Param("commentTableName") String commentTableName,
                                    @Param("toCommentId") Integer toCommentId);

    public List<Comment> findCommentsByEssayId(@Param("commentTableName") String commentTableName,
                                               @Param("essay") Essay essay);

    public List<Comment> findCommentsByToCommentId(@Param("commentTableName") String commentTableName,
                                                   @Param("comment") Comment comment);

    public List<DynamicComment> findDynamicComment(@Param("commentTableName") String commentTableName,
                                                   @Param("comment_from_user_id") Integer comment_from_user_id);
}
