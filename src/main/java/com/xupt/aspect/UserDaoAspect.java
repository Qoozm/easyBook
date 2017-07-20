package com.xupt.aspect;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;

/**
 * Created by colin on 2017/7/14.
 */
@Component
public class UserDaoAspect {

    public String afterRepetition(DuplicateKeyException dex) {
        System.out.println("aspect");
        return "123";
    }
}