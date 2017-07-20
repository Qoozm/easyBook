package com.xupt.utils;

import sun.misc.BASE64Encoder;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by colin on 2017/7/18.
 */
public class MD5 {

    public static String encoderByMd5(String password) {

        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            BASE64Encoder base64Encoder = new BASE64Encoder();
            password = base64Encoder.encode(messageDigest.digest(password.getBytes()));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return password;
    }
}
