package com.bgzyy.design.pattern.factory.abs.pizzastore.store;

import com.bgzyy.design.pattern.factory.abs.pizzastore.pizza.Pizza;

/**
 * @author bgzyy
 * @since 2019/9/9
 */
public interface AbsFactory {
    Pizza createPizza(String pizzaType);
}