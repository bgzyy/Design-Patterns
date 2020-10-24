package com.bgzyy.design.pattern.bridge.bridgephone;

/**
 * @author bgzyy
 * @since 2019/9/18
 */
public abstract class Phone {

    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }
}
