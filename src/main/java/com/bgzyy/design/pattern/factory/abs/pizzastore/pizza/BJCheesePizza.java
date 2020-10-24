package com.bgzyy.design.pattern.factory.abs.pizzastore.pizza;

/**
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class BJCheesePizza extends Pizza {
    public BJCheesePizza(String name) {
        super(name);
    }

    @Override
    public void prepare() {
        System.out.println("开始制作北京奶酪披萨，准备奶酪中！");
    }
}
