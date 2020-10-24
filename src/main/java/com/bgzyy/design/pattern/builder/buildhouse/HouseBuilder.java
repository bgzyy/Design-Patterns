package com.bgzyy.design.pattern.builder.buildhouse;

/**
 * @author bgzyy
 * @since 2019/9/11
 */
public abstract class HouseBuilder {
    abstract void buildBasic();

    abstract void buildWall();

    abstract void buildRoof();

    abstract House buildHouse();
}
