package com.xupt.service;

import com.xupt.bean.Comment;

/**
 * Created by colin on 2017/7/16.
 */
public interface ICommentService {

    public int searchWhereToSaveComment(Integer essayId);

    public void saveComment(Comment comment);

    public void deleteCommentByEassy(Integer essayId);

    public void deleteMyComment(Integer commentId, Integer essayId);
}
