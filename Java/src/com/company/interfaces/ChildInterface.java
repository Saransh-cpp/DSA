package com.company.interfaces;

public class ChildInterface implements ParentOne, ParentTwo{

    @Override
    public void teach() {
        System.out.println("Teaching");
    }

    @Override
    public void study() {
        System.out.println("Studying");
    }
}
