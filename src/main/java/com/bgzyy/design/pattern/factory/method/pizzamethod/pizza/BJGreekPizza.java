package com.bgzyy.design.pattern.factory.method.pizzamethod.pizza;

/**
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class BJGreekPizza extends Pizza {
    public BJGreekPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("希腊披萨开始制作，准备火腿肠中！");
    }
}
