package com.bgzyy.design.pattern.singleton;

/**
 * 单例，双重检查（解决线程安全和懒加载问题）
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class Singleton6 {
}

class SingletonOf6 {
    private SingletonOf6() {
    }

    private static volatile SingletonOf6 instance;

    public static SingletonOf6 getInstance() {
        if (instance == null) {
            synchronized (SingletonOf6.class) {
                if (instance == null) {
                    instance = new SingletonOf6();
                }
            }
        }
        return instance;
    }
}