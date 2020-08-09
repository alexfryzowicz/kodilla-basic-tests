package com.kodilla.abstracts.homework;

public class Rectangle2 extends Shape{
   public Rectangle2() {
        super(5, 5);
    }
    public double calculateArea2(double a, double b) {
        return a * b;
    }
    public double calculateCircuit2(double a, double b) {
        return 2*a + 2*b;
    }
}