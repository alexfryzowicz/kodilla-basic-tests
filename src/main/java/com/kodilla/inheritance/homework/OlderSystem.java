package com.kodilla.inheritance.homework;

public class OlderSystem extends LatestSystem {
    public void turnOn() {
        System.out.println("system turn on - older");
    }

    public void turnOff() {
        System.out.println("system turn off - older");
    }

    public OlderSystem(int version, int year) {
        super(version, year);
    }

}
