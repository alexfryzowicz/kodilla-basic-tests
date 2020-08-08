package com.kodilla.inheritance.homework;

public class OPRunner {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(6, 1998);
        operatingSystem.turnOn();

        LatestSystem latestSystem = new LatestSystem(7, 1999);
        latestSystem.displayNumberOfVersion();

        OlderSystem olderSystem = new OlderSystem(8, 2000);
        olderSystem.displayNumberOfVersion();
    }
}
