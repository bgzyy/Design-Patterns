package com.bgzyy.design.pattern.bridge.bridgephone;

/**
 * @author bgzyy
 * @since 2019/9/18
 */
public class XiaoMi implements Brand {
    @Override
    public void open() {
        System.out.println("小米手机开机！");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机！");
    }
}
