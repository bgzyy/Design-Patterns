package com.bgzyy.design.pattern.singleton;

/**
 * 单例模式：静态常量饿汗式
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class Singleton1 {
    public static void main(String[] args) {
        SingletonOf1 instance1 = SingletonOf1.getInstance();
        SingletonOf1 instance2 = SingletonOf1.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class SingletonOf1 {
    // 1. 私有化构造器
    private SingletonOf1() {}

    // 2. 创建私有静态对象
    private static final SingletonOf1 INSTANCE = new SingletonOf1();

    // 3. 创建共有静态方法返回私有对象
    public static SingletonOf1 getInstance() {
        return INSTANCE;
    }
}