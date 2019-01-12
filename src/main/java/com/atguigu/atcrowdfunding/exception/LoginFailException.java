package com.atguigu.atcrowdfunding.exception;

/**
 * @Author Elvis Chen
 * @Date 2019/1/12 2:00
 * @Version 1.0
 **/
public class LoginFailException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public LoginFailException(String message){
        super(message);
    }
}
