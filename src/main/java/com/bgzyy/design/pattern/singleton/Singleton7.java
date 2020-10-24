package com.bgzyy.design.pattern.singleton;

/**
 * 单例：静态内部类
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class Singleton7 {
    public static void main(String[] args) {
        SingletonOf7 instance1 = SingletonOf7.getInstance();
        SingletonOf7 instance2 = SingletonOf7.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class SingletonOf7 {
    private SingletonOf7() {}

    private static class SingletonInstance {
        private static final SingletonOf7 INSTANCE = new SingletonOf7();
    }

    public static SingletonOf7 getInstance() {
        return SingletonInstance.INSTANCE;
    }
}