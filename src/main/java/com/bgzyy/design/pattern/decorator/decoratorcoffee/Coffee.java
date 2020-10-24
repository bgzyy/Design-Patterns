package com.bgzyy.design.pattern.decorator.decoratorcoffee;

/**
 * @author bgzyy
 * @since 2019/9/19
 */
public class Coffee extends Drink {
    @Override
    public Double cost() {
        return super.getPrice();
    }
}
