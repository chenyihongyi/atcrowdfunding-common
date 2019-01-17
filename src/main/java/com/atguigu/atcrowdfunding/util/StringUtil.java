package com.atguigu.atcrowdfunding.util;

/**
 * @Author Elvis Chen
 * @Date 2019/1/15 22:06
 * @Version 1.0
 **/
public class StringUtil {

    public static boolean isEmpty(String s) {
        return s == null || "".equals(s);  //     s == null | s.equals("");  //位与,逻辑与区别,非空字符串放置在前面,避免空指针
    }

    public static boolean isNotEmpty(String s) {
        return !isEmpty(s);
    }

}
