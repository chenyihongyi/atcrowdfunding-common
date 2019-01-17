package com.atguigu.atcrowdfunding.util;

/**
 * @Author Elvis Chen
 * @Date 2019/1/15 14:33
 * @Version 1.0
 **/
public class AjaxResult {

    private boolean success;
    private String message;

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
