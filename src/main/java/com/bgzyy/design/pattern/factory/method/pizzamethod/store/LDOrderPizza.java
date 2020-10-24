package com.bgzyy.design.pattern.factory.method.pizzamethod.store;

import com.bgzyy.design.pattern.factory.method.pizzamethod.pizza.LDCheesePizza;
import com.bgzyy.design.pattern.factory.method.pizzamethod.pizza.LDGreekPizza;
import com.bgzyy.design.pattern.factory.method.pizzamethod.pizza.Pizza;

/**
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/9.
 */
public class LDOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new LDCheesePizza(type);
        } else if ("greek".equalsIgnoreCase(type)) {
            pizza = new LDGreekPizza(type);
        }
        return pizza;
    }
}
