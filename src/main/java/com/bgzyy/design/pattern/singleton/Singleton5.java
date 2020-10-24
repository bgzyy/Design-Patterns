package com.bgzyy.design.pattern.singleton;

/**
 * 懒汉式，同步代码块
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class Singleton5 {
}

class SingletonOf5 {
    private SingletonOf5() {}

    private static SingletonOf5 instance;

    public static SingletonOf5 getInstance() {
        if (instance == null) {
            synchronized (SingletonOf5.class) {
                instance = new SingletonOf5();
            }
        }
        return instance;
    }
}
