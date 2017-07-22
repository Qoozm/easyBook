package com.xupt.service.serviceImpl;

import com.xupt.bean.User;
import com.xupt.dao.IUserDao;
import com.xupt.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by colin on 2017/7/14.
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    IUserDao userDao;

    public boolean register(User user) {

        boolean result = false;

        String phoneReg = "^((13[0-9])|(14[5|7])|(15([0-3]|[5-9]))|(18[0,5-9]))\\d{8}$";

        String emailReg = "^[A-Za-z0-9\\u4e00-\\u9fa5]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$";

        if (user.getUser_email() != null && user.getUser_name() != null && user.getUser_password() != null && user.getUser_phone() != null) {
            if (userDao.findUserByName(user.getUser_name()) == null
                    && user.getUser_phone().matches(phoneReg)
                    && user.getUser_email().matches(emailReg)) {

                userDao.saveUser(user);
                result = true;
            }
        }

        return result;
    }

    public User loginCheck(String account, String pwd) {

        User user = null;

        String emailReg = "^[a-zA-Z1-9]+\\w*@[a-zA-Z]{1,5}.[a-zA-Z]{2,5}$";
        String phoneReg = "^1[3|4|5|8][0-9]\\d{8}$";

        if (account.matches(emailReg)) {
            user = userDao.findUserByEmail(account);
        }

        if (account.matches(phoneReg)) {
            user = userDao.findUserByPhone(account);
        }

        if (user != null && user.getUser_password().equals(pwd)) {
            return user;
        } else {
            user = null;
        }

        return user;
    }

    public User registerCheckPhone(String phone) {
        User user;
        user = userDao.findUserByPhone(phone);
        return user;
    }

    public User registerCheckName(String name) {
        User user;
        user = userDao.findUserByName(name);
        return user;
    }

    public User registerCheckEmail(String email) {
        User user;
        user = userDao.findUserByEmail(email);
        return user;
    }
}
