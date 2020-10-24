package com.bgzyy.design.pattern.factory.abs.pizzastore.store;

import com.bgzyy.design.pattern.factory.abs.pizzastore.pizza.BJCheesePizza;
import com.bgzyy.design.pattern.factory.abs.pizzastore.pizza.BJGreekPizza;
import com.bgzyy.design.pattern.factory.abs.pizzastore.pizza.Pizza;

/**
 * @author bgzyy
 * @since 2019/9/9
 */
public class BJPizzaFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        if ("cheese".equalsIgnoreCase(pizzaType)) {
            pizza = new BJCheesePizza(pizzaType);
        } else if ("greek".equalsIgnoreCase(pizzaType)) {
            pizza = new BJGreekPizza(pizzaType);
        }
        return pizza;
    }
}
