package com.bgzyy.design.pattern.composite.university;

/**
 * @author bgzyy
 * @since 2019/9/19
 */
public class Department extends OrganizationComponent {

    public Department(String name, String description) {
        super(name, description);
    }

    @Override
    protected void print() {
        System.out.print(super.getName() + " ");
    }
}
