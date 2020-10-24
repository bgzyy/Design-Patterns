package com.bgzyy.design.pattern.builder.tradition;

/**
 * @author bgzyy
 * @since 2019/9/11
 */
public class HouseTraditionClient {
    public static void main(String[] args) {
        CommonHouse commonHouse = new CommonHouse();
        commonHouse.build();
    }
}
