package com.bgzyy.design.pattern.bridge.bridgephone;

/**
 * @author bgzyy
 * @since 2019/9/18
 */
public class PhoneClient {
    public static void main(String[] args) {
        Folded foldedPhone = new Folded(new XiaoMi());
        foldedPhone.open();
        foldedPhone.close();

        System.out.println("----------------------");

        UpRight upRightPhone = new UpRight(new Huawei());
        upRightPhone.open();
        upRightPhone.close();
    }
}
