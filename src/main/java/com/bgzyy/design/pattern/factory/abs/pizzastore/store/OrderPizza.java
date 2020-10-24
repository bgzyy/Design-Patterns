package com.bgzyy.design.pattern.factory.abs.pizzastore.store;

import com.bgzyy.design.pattern.factory.abs.pizzastore.pizza.Pizza;

import java.util.*;

/**
 * @author bgzyy
 * @since 2019/9/9
 */
public class OrderPizza {
    private Scanner scanner = new Scanner(System.in);
    private AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
        String pizzaType = getType();
        Pizza pizza = this.absFactory.createPizza(pizzaType);
        if (pizza != null) {
            pizzaFlow(pizza);
        }
    }

    public void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;

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