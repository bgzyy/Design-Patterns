package com.bgzyy.design.pattern.singleton;

/**
 * 懒汉式，线程不安全，需要的时候才会去创建
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class Singleton3 {
}

class SingletonOf3 {
    private SingletonOf3() {}

    private static SingletonOf3 instance;

    public static SingletonOf3 getInstance() {
        if (instance == null) {
            instance = new SingletonOf3();
        }
        return instance;
    }
}