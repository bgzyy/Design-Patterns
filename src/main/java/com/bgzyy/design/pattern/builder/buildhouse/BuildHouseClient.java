package com.bgzyy.design.pattern.builder.buildhouse;

/**
 * @author bgzyy
 * @since 2019/9/11
 */
public class BuildHouseClient {
    public static void main(String[] args) {
        HouseDirector houseDirector = new HouseDirector();
        houseDirector.setBuilder(new CommonHouse());
        House house = houseDirector.constructHouse();
        System.out.println(house);
    }
}
