package com.bgzyy.design.pattern.decorator.decoratorcoffee;

/**
 * @author bgzyy
 * @since 2019/9/19
 */
public class Soy extends Decorator {
    public Soy(Drink drink) {
        super(drink);
        setDescription("豆浆");
        setPrice(3.0);
    }
}
