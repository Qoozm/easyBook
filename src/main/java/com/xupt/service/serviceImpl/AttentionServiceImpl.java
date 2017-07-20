//package com.xupt.service.serviceImpl;
//
//import com.xupt.bean.AttentionExample;
//import com.xupt.bean.User;
//import com.xupt.dao.IAttentionDao;
//import com.xupt.dao.IUserDao;
//import com.xupt.service.IAttentionService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * Created by 慧乔乔 on 2017/7/15.
// */
//@Service
//public class AttentionServiceImpl implements IAttentionService {
//
//    @Autowired
//    IAttentionDao attentionDao;
//
//    @Autowired
//    IUserDao userDao;
//
//    public void setUserAttention(User user) {
//
//        int userId = user.getUser_id();
//        int attentionTable = userId % 5;
//
//        if (attentionTable == 0) {
//            user.setUser_attention("attention_1");
//            userDao.updateAttention(user);
//        }
//        if (attentionTable == 1) {
//            user.setUser_attention("attention_2");
//            userDao.updateAttention(user);
//        }
//        if (attentionTable == 2) {
//            user.setUser_attention("attention_3");
//            userDao.updateAttention(user);
//        }
//        if (attentionTable == 3) {
//            user.setUser_attention("attention_4");
//            userDao.updateAttention(user);
//        }
//        if (attentionTable == 4) {
//            user.setUser_attention("attention_5");
//            userDao.updateAttention(user);
//        }
//    }
//
//    public void attentionUser(Integer user_from_id, Integer user_to_id) {
//        User user = userDao.findOne(user_from_id);
//        String attentionTable = user.getUser_attention();
//        AttentionExample example = new AttentionExample();
//        example.setTo_user_id(user_to_id);
//        example.setFrom_user_id(user_from_id);
//        example.setTableName(attentionTable);
//        attentionDao.save(example);
//    }
//
//    public void removeAttention(Integer user_from_id, Integer user_to_id) {
//        User user = userDao.findOne(user_from_id);
//        String attentionTable = user.getUser_attention();
//        AttentionExample example = new AttentionExample();
//        example.setTableName(attentionTable);
//        example.setTo_user_id(user_to_id);
//        example.setFrom_user_id(user_from_id);
//        attentionDao.deleteOneByToUserId(example);
//    }
//}
