package com.xupt.service.serviceImpl;

import com.xupt.bean.Comment;
import com.xupt.bean.Message;
import com.xupt.dao.ICommentDao;
import com.xupt.service.ICommentService;
import com.xupt.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by colin on 2017/7/16.
 */
@Service
public class CommentServiceImpl implements ICommentService {

    private final int COMMENT_TABLE_COUNT = 5;
    private String PER_COMMENT_TABLE_NAME = "ebcomment_";

    @Autowired
    ICommentDao commentDao;

    @Autowired
    IMessageService messageService;

    public int searchWhereToSaveComment(Integer essayId) {
        int result;

        result = essayId % COMMENT_TABLE_COUNT;

        return result;
    }

    public void saveComment(Integer essayId, Comment comment) {

        int tableCount = searchWhereToSaveComment(essayId);
        String commentTableName = PER_COMMENT_TABLE_NAME + tableCount;

        commentDao.saveComment(commentTableName, comment);

        messageService.saveMessage(comment.getComment_from_user_id(), comment.getComment_to_user_id(), "", Message.MessageCategory.get("评论"));
    }

    public void deleteCommentByEassy(Integer essayId) {

        int tableCount = searchWhereToSaveComment(essayId);
        String commentTableName = PER_COMMENT_TABLE_NAME + tableCount;

        commentDao.deleteByEssayId(commentTableName, essayId);
    }

    public void deleteMyComment(Integer commentId, Integer essayId) {

        int tableCount = searchWhereToSaveComment(essayId);
        String commentTableName = PER_COMMENT_TABLE_NAME + tableCount;

        commentDao.deleteByToCommentId(commentTableName, commentId);
        commentDao.deleteByCommentId(commentTableName, commentId);
    }

}
