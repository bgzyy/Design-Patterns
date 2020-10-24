package com.bgzyy.design.pattern.factory.method.pizzamethod.store;

/**
 * 客户端，发订购请求
 * 简单工厂方式优化
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class PizzaStore {
    public static void main(String[] args) {
//        new BJOrderPizza();
        new LDOrderPizza();
    }
}