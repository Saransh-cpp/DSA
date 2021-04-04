package com.company.OOPs.inheritance;

public class Vehicle {

    private int wheels = 2;

    public void getWheels () {
        System.out.println(this.wheels);
    }

    public void setWheels (int wheels) {
        this.wheels = wheels;
    }

    public static void start () {
        System.out.println("Start like a general vehicle");
    }
}
