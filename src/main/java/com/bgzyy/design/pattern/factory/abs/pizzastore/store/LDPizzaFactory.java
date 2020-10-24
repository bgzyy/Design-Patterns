package com.bgzyy.design.pattern.factory.abs.pizzastore.store;

import com.bgzyy.design.pattern.factory.abs.pizzastore.pizza.*;

/**
 * @author bgzyy
 * @since 2019/9/9
 */
public class LDPizzaFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equalsIgnoreCase(pizzaType)) {
            pizza = new LDCheesePizza(pizzaType);
        } else if ("greek".equalsIgnoreCase(pizzaType)) {
            pizza = new LDGreekPizza(pizzaType);
        }
        return pizza;
    }
}
