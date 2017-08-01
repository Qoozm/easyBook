package com.xupt.service;

import com.xupt.bean.User;

import java.util.List;

/**
 * Created by colin on 2017/7/13.
 */
public interface IUserService {

    public boolean register(User user);

    public User loginCheck(String account, String pwd);

    public User registerCheckPhone(String phone);

    public User registerCheckName(String name);

    public User registerCheckEmail(String email);

    public List<User> loadHotAuthor();
}
