package com.bgzyy.design.pattern.bridge.bridgephone;

/**
 * @author bgzyy
 * @since 2019/9/18
 */
public class Folded extends Phone {
    public Folded(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("折叠！");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("折叠！");
    }
}
