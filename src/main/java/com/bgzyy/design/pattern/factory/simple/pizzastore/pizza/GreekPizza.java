package com.bgzyy.design.pattern.factory.simple.pizzastore.pizza;

/**
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class GreekPizza extends Pizza {
    public GreekPizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("希腊披萨开始制作，准备火腿肠中！");
    }
}
