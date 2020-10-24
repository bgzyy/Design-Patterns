package com.bgzyy.design.pattern.factory.method.pizzamethod.pizza;

/**
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/9.
 */
public class LDGreekPizza extends Pizza {
    public LDGreekPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("开始制作伦敦奶酪披萨，准备奶酪中");
    }
}
