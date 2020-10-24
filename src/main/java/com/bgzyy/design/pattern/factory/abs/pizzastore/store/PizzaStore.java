package com.bgzyy.design.pattern.factory.abs.pizzastore.store;

/**
 * @author bgzyy
 * @since 2019/9/9
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJPizzaFactory());
    }
}
