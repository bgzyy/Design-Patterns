package com.bgzyy.design.pattern.factory.simple.pizzasimple.store;

import com.bgzyy.design.pattern.factory.simple.pizzasimple.pizza.Pizza;

import java.util.Scanner;

/**
 * 在 OrderPizza 中使用 set 方法注入 SimpleFactory，即聚合
 *      - 也可以直接在该类中初始化 SimpleFactory，即是组合的方式
 *      - 也可以将简单工厂的方法设为 static，当做一个工具类去使用
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class OrderPizza {

    private Scanner scanner = new Scanner(System.in);
    private SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        String pizzaType = getType();
        Pizza pizza = this.simpleFactory.createPizza(pizzaType);
        if (pizza != null) {
            pizzaFlow(pizza);
        }
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