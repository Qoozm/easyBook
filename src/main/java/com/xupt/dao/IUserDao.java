package com.xupt.dao;

import com.xupt.bean.User;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by colin on 2017/7/13.
 */
@Repository
public interface IUserDao {

    public void saveUser(User user) throws DuplicateKeyException;

    public void updateUserInfo(User user);

    public void updateUserThumb(Integer userId, Integer thumbNum);

    public List<User> findAll();

    public User findUserById(Integer userId);

    public User findUserByPhone(String phone);

    public User findUserByName(String name);

    public User findUserByEmail(String email);

    public List<User> findHotUser();
}
