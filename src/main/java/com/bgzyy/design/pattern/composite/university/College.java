package com.bgzyy.design.pattern.composite.university;

import java.util.*;

/**
 * @author bgzyy
 * @since 2019/9/19
 */
public class College extends OrganizationComponent {

//    存储所有的 Department
    private List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    public College(String name, String description) {
        super(name, description);
    }

    @Override
    protected void add(OrganizationComponent organizationComponent) {
        organizationComponentList.add(organizationComponent);
    }

    @Override
    protected void remove(OrganizationComponent organizationComponent) {
        organizationComponentList.remove(organizationComponent);
    }

    @Override
    protected void print() {
        System.out.print(super.getName() + ": ");
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
        System.out.println();
    }
}
