package com.xupt.dao;

import com.xupt.bean.Comment;
import com.xupt.bean.Essay;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by colin on 2017/7/15.
 */
public interface ICommentDao {

    public void saveComment(@Param("commentTableName") String commentTableName, @Param("comment") Comment comment);

    public void deleteByEssayId(@Param("commentTableName") String commentTableName, @Param("essayId") String essayId);

    public void deleteByCommentId(@Param("commentTableName") String commentTableName, @Param("commentId") String commentId);

    public void deleteByToCommentId(@Param("commentTableName") String commentTableName, @Param("toCommentId") String toCommentId);

    public List<Comment> findCommentsByEssayId(@Param("commentTableName") String commentTableName, @Param("essay") Essay essay);

    public List<Comment> findCommentsByToCommentId(@Param("commentTableName") String commentTableName, @Param("comment") Comment comment);
}
