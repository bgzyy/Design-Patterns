package com.bgzyy.design.pattern.composite.university;

import java.util.*;

/**
 * @author bgzyy
 * @since 2019/9/19
 */
public class University extends OrganizationComponent {

    //    存储所有的 College
    private List<OrganizationComponent> organizationComponentList = new ArrayList<>();

    public University(String name, String description) {
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
        System.out.println(super.getName());
        for (OrganizationComponent organizationComponent : organizationComponentList) {
            organizationComponent.print();
        }
    }
}
