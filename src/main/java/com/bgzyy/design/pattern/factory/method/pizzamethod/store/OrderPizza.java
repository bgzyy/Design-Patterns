package com.bgzyy.design.pattern.factory.method.pizzamethod.store;

import com.bgzyy.design.pattern.factory.method.pizzamethod.pizza.Pizza;

import java.util.Scanner;

/**
 * 将 OrderPizza 定义为抽象类，各个区域分别继承该类
 *      - 该类将 createPizza 的任务交由继承的子类去实现
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public abstract class OrderPizza {

    private Scanner scanner = new Scanner(System.in);
    public abstract Pizza createPizza(String type);

    public OrderPizza() {
        String type = getType();
        Pizza pizza = createPizza(type);
        pizzaFlow(pizza);
    }

    public String getType() {
        System.out.print("请输入 Pizza 类型：");
        String type = scanner.next();
        return type;
    }

    public void pizzaFlow(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }
}