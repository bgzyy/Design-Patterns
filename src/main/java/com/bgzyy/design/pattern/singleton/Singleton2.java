package com.bgzyy.design.pattern.singleton;

/**
 * 饿汗式（静态代码块）
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class Singleton2 {

    public static void main(String[] args) {
        SingletonOf2 instance1 = SingletonOf2.getInstance();
        SingletonOf2 instance2 = SingletonOf2.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class SingletonOf2 {
    //    1. 私有化
    private SingletonOf2() {
    }

    // 2. 静态变量
    private static SingletonOf2 instance;

    // 3. 静态变量在静态代码块中初始化
    static {
        instance = new SingletonOf2();
    }

    // 4. 提供共有方法
    public static SingletonOf2 getInstance() {
        return instance;
    }
}