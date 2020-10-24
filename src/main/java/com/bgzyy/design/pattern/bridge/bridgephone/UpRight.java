package com.bgzyy.design.pattern.bridge.bridgephone;

/**
 * @author bgzyy
 * @since 2019/9/18
 */
public class UpRight extends Phone {
    public UpRight(Brand brand) {
        super(brand);
    }

    @Override
    public void open() {
        super.open();
        System.out.println("翻盖！");
    }

    @Override
    public void close() {
        super.close();
        System.out.println("翻盖！");
    }
}
