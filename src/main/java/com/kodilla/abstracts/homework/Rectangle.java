package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    public Rectangle() {
        super(4, 4);
    }
    public double calculateArea(double a, double b) {
        return a*b;
    }
    public double calculateCircuit(double a, double b) {
        return 2*a + 2*b;
    }
}
