package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int version;
    private int year;

    public OperatingSystem(int version, int year) {
        this.version = version;
        this.year = year;
    }

    public void turnOn() {
        System.out.println("system turn on");
    }

    public void turnOff() {
        System.out.println("system turn off");
    }

    public int getVersion() {
        return version;
    }

    public int getYear() {
        return year;
    }

    public void displayNumberOfVersion() {
        System.out.println("number of version is: " + version);
    }
}
