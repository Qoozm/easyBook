package com.xupt.service;

import com.xupt.bean.Comment;
import com.xupt.bean.DynamicComment;

import java.util.List;

/**
 * Created by colin on 2017/7/16.
 */
public interface ICommentService {

    public int searchWhereToSaveComment(Integer essayId);

    public void saveComment(Integer essayId, Comment comment);

    public void deleteCommentByEssay(Integer essayId);

    public void deleteMyComment(Integer commentId, Integer essayId);

    public List<DynamicComment> searchDynamicComment(Integer comment_from_user_id);
}
