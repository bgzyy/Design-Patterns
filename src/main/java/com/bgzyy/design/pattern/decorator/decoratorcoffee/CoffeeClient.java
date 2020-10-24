package com.bgzyy.design.pattern.decorator.decoratorcoffee;

/**
 * @author bgzyy
 * @since 2019/9/19
 */
public class CoffeeClient {
    public static void main(String[] args) {
        Drink drinkBlack = new ShortBlack();
        System.out.println(drinkBlack.getDescription() + ": $" + drinkBlack.cost());

        drinkBlack = new Milk(drinkBlack);
        System.out.println(drinkBlack.getDescription() + ": $" + drinkBlack.cost());

        drinkBlack = new Soy(drinkBlack);
        System.out.println(drinkBlack.getDescription() + ": $" + drinkBlack.cost());

        Drink drinkDecaf = new Decaf();
        System.out.println(drinkDecaf.getDescription() + ": $" + drinkDecaf.cost());

        drinkDecaf = new Milk(new Milk(drinkDecaf));
        System.out.println(drinkDecaf.getDescription() + ": $" + drinkDecaf.cost());
    }
}
