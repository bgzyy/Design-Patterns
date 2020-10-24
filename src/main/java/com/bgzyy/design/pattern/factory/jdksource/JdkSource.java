package com.bgzyy.design.pattern.factory.jdksource;

import java.util.*;

/**
 * Java 源码中的 Calendar 类使用了简单工厂模式
 * @author bgzyy
 * @since 2019/9/10
 */
public class JdkSource {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("年：" + calendar.get(Calendar.YEAR));
        System.out.println("月：" + (calendar.get(Calendar.MONTH) + 1));
        System.out.println("日：" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("时：" + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("分：" + calendar.get(Calendar.MINUTE));
        System.out.println("秒：" + calendar.get(Calendar.SECOND));
    }
}