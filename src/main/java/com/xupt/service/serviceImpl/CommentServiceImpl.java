//package com.xupt.service.serviceImpl;
//
//import com.xupt.bean.Comment;
//import com.xupt.bean.Essay;
//import com.xupt.dao.ICommentDao;
//import com.xupt.service.ICommentService;
//import com.xupt.service.IMessageService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * Created by colin on 2017/7/16.
// */
//@Service
//public class CommentServiceImpl implements ICommentService {
//
//    private final int COMMENT_TABLE_COUNT = 5;
//    private String PER_COMMENT_TABLE_NAME = "ebcomment_";
//
//    @Autowired
//    ICommentDao commentDao;
//
//    @Autowired
//    IMessageService messageService;
//
//    public int searchWhereToSaveComment(Integer essayId) {
//        int result;
//
//        result = essayId % COMMENT_TABLE_COUNT;
//
//        return result;
//    }
//
//    public void saveComment(Comment comment) {
//
//        commentDao.saveComment(comment);
//
//        messageService.saveMessage(comment.getComment_from_user_id(), comment.getComment_to_user_id(), "", "comment");
//    }
//
//    public void deleteCommentByEassy(Integer essayId) {
//        String comment_table_name = PER_COMMENT_TABLE_NAME + essayId % COMMENT_TABLE_COUNT;
//
//        Essay essay = new Essay();
//        essay.setEssay_comment_tablename(comment_table_name);
//        essay.setEssay_id(essayId);
//
//        commentDao.deleteByEssay(essay);
//    }
//
//    public void deleteMyComment(Integer commentId, Integer essayId) {
//        String comment_table_name = PER_COMMENT_TABLE_NAME + essayId % COMMENT_TABLE_COUNT;
//
//        Comment comment = new Comment();
//        comment.setComment_tableName(comment_table_name);
//        comment.setComment_id(commentId);
//
//        commentDao.deleteByToCommentId(comment);
//        commentDao.deleteByCommentId(comment);
//    }
//
//}
