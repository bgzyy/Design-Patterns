package com.bgzyy.design.pattern.factory.simple.pizzasimple.store;

import com.bgzyy.design.pattern.factory.simple.pizzasimple.pizza.CheesePizza;
import com.bgzyy.design.pattern.factory.simple.pizzasimple.pizza.GreekPizza;
import com.bgzyy.design.pattern.factory.simple.pizzasimple.pizza.Pizza;

/**
 * Created by bgzyy
 * Email bgzyy@foxmail.com
 * Date 2019/9/6.
 */
public class SimpleFactory {

    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("Cheese".equalsIgnoreCase(pizzaType)) {
            pizza = new CheesePizza(pizzaType);
        } else if ("Greek".equalsIgnoreCase(pizzaType)) {
            pizza = new GreekPizza(pizzaType);
        }
        return pizza;
    }
}