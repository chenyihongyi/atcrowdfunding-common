package com.atguigu.atcrowdfunding.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Elvis Chen
 * @Date 2019/1/29 19:55
 * @Version 1.0
 **/
public class BaseController {

    private ThreadLocal<Map<String, Object>> datas = new ThreadLocal<Map<String, Object>>();

    protected void start(){
        Map<String, Object> resultMap = new HashMap<String, Object>();
        datas.set(resultMap);
    }

    public Object end(){
        Map<String, Object> resultMap = datas.get();
        datas.remove();
        return resultMap;
    }

    public void success(boolean flg){
        Map<String, Object> resultMap = datas.get();
        resultMap.put("success", flg);
    }

    public void param(String key, Object val){
        Map<String, Object> resultMap = datas.get();
        resultMap.put(key, val);
    }

    public void error(String msg){
        Map<String, Object> resultMap = datas.get();
        resultMap.put("message", msg);
    }



}
