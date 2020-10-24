package com.bgzyy.design.pattern.singleton;

/**
 * 枚举的方式创建单例
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class Singleton8 {
    public static void main(String[] args) {
        SingletonOf8 instance1 = SingletonOf8.INSTANCE;
        SingletonOf8 instance2 = SingletonOf8.INSTANCE;
        System.out.println(instance1 == instance2);
    }
}

enum SingletonOf8 {
    INSTANCE;
    public void say() {
        System.out.println("Hello!");
    }
}