package com.bgzyy.design.pattern.factory.simple.pizzasimple.pizza;

/**
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class CheesePizza extends Pizza {
    public CheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("开始制作奶酪披萨，准备奶酪中！");
    }
}
