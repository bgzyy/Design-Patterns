package com.bgzyy.design.pattern.prototype.deepcopy;

/**
 * @author bgzyy
 * @since 2019/9/10
 */
public class Client {
    public static void main(String[] args) {
        BlackSheep blackSheep1 = new BlackSheep("bgzyy", 12, new ChinaSheep("smzyy", "white"));

//        BlackSheep blackSheep2 = (BlackSheep) blackSheep1.clone();
        BlackSheep blackSheep2 = (BlackSheep) blackSheep1.deepClone();
        System.out.println(blackSheep1 + "; " + blackSheep1.getChinaSheep().hashCode());
        System.out.println(blackSheep2 + "; " + blackSheep2.getChinaSheep().hashCode());
    }
}