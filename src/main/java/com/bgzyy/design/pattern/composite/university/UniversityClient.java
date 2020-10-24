package com.bgzyy.design.pattern.composite.university;

/**
 * @author bgzyy
 * @since 2019/9/19
 */
public class UniversityClient {
    public static void main(String[] args) {
        University university = new University("Xi'an University", "Xi'an NB");

        College college1 = new College("信息工程学院", "信息工程学院");
        College college2 = new College("人文学院", "人文学院");
        College college3 = new College("环境工程学院", "环境工程学院");

        Department department1 = new Department("物联网工程", "物联网工程");
        Department department2 = new Department("计算机", "计算机");

        university.add(college1);
        university.add(college2);
        university.add(college3);

        college1.add(department1);
        college1.add(department2);

        university.print();
    }
}