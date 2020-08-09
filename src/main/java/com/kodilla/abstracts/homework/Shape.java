package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int a;
    private int b;

    public Shape(int a,int b) {
        this.a = a;
        this.b = b;
    }

    public int a() {
        return a;
    }

    public int b() {
        return b;
    }

    public double calculateArea(double a, double b) {
        return 2 * b;
    }

    public double calculateCircuit(double a, double b) {
        return 2*a + 2*b;
    }


}
