package com.bgzyy.design.pattern.decorator.decoratorcoffee;

/**
 * @author bgzyy
 * @since 2019/9/19
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public Double cost() {
//        super.getPrice() 为当前装饰的价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
//        drink.getDescription() 输出被装饰者的信息
        return super.getDescription() + ": " + super.getPrice() + ", " + drink.getDescription();
    }
}
