package com.bgzyy.design.pattern.decorator.decoratorcoffee;

/**
 * @author bgzyy
 * @since 2019/9/19
 */
public abstract class Drink {
    private String description;
    private Double price;

    public abstract Double cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
