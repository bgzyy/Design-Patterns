package com.bgzyy.design.pattern.factory.simple.pizzastore.store;

import com.bgzyy.design.pattern.factory.simple.pizzastore.pizza.CheesePizza;
import com.bgzyy.design.pattern.factory.simple.pizzastore.pizza.GreekPizza;
import com.bgzyy.design.pattern.factory.simple.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class OrderPizza {

    Scanner scanner = new Scanner(System.in);

    public OrderPizza() {
        init();
    }

    public void init() {
        String pizzaType = getType();
        Pizza pizza = null;
        if ("Cheese".equalsIgnoreCase(pizzaType)) {
            pizza = new CheesePizza(pizzaType);
        } else if ("Greek".equalsIgnoreCase(pizzaType)) {
            pizza = new GreekPizza(pizzaType);
        } else {
            System.out.println("没有该类型披萨！");
        }
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