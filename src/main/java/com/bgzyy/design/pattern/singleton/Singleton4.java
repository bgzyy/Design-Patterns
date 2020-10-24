package com.bgzyy.design.pattern.singleton;

/**
 * 懒汉式，同步方法
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class Singleton4 {
}

class SingletonOf4 {
    private SingletonOf4() {}

    private static SingletonOf4 instance;

    public static synchronized SingletonOf4 getInstance() {
        if (instance == null) {
            instance = new SingletonOf4();
        }
        return instance;
    }
}