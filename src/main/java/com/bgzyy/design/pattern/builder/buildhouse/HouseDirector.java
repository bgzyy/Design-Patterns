package com.bgzyy.design.pattern.builder.buildhouse;

/**
 * @author bgzyy
 * @since 2019/9/11
 */
public class HouseDirector {
    private HouseBuilder builder;

    public void setBuilder(HouseBuilder builder) {
        this.builder = builder;
    }

    public House constructHouse() {
        builder.buildBasic();
        builder.buildWall();
        builder.buildRoof();
        return builder.buildHouse();
    }
}