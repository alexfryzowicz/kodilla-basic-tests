package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public Square() {
        super(6,6);
    }

    public double calculateArea3(double a, double b) {
        return a * a;
    }
    public double calculateCircuit3(double a, double b) {
        return 4*a;
    }
}
