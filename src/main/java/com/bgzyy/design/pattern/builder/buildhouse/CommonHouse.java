package com.bgzyy.design.pattern.builder.buildhouse;

/**
 * @author bgzyy
 * @since 2019/9/11
 */
public class CommonHouse extends HouseBuilder {
    private House house = new House();

    @Override
    public void buildBasic() {
        house.setBasic("5m");
        System.out.println("普通房子打地基！");
    }

    @Override
    public void buildWall() {
        house.setWall("10m");
        System.out.println("普通房子砌墙十米！");
    }

    @Override
    public void buildRoof() {
        house.setRoof("茅草屋顶");
        System.out.println("普通房子封顶！");
    }

    @Override
    House buildHouse() {
        return house;
    }
}
