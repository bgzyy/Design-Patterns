package com.bgzyy.design.pattern.factory.method.pizzamethod.store;

import com.bgzyy.design.pattern.factory.method.pizzamethod.pizza.BJCheesePizza;
import com.bgzyy.design.pattern.factory.method.pizzamethod.pizza.BJGreekPizza;
import com.bgzyy.design.pattern.factory.method.pizzamethod.pizza.Pizza;

/**
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/9.
 */
public class BJOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if ("cheese".equalsIgnoreCase(type)) {
            pizza = new BJCheesePizza(type);
        } else if ("greek".equalsIgnoreCase(type)) {
            pizza = new BJGreekPizza(type);
        }
        return pizza;
    }
}
