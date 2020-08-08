package com.kodilla.inheritance.homework;

public class LatestSystem extends OperatingSystem {
    public LatestSystem(int version, int year) {
        super(version, year);
    }

    public void turnOn() {
        System.out.println("system turn on - latest");
    }

    public void turnOff() {
        System.out.println("system turn off - latest");
    }

}
