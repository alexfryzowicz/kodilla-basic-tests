package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        double area = rectangle.calculateArea(10, 4);
        double circuit = rectangle.calculateCircuit(10, 4);
        System.out.println("area rectangle= " + circuit);
        System.out.println("circuit rectangle= " + circuit);

        Rectangle2 rectangle2 = new Rectangle2();
        double area2 = rectangle.calculateArea(5, 5);
        double circuit2 = rectangle.calculateCircuit(5, 5);
        System.out.println("area rectangle2= " + area2);
        System.out.println("circuit rectangle2= " + circuit2);

        Square square = new Square();
        double area3 = square.calculateArea(6, 6);
        double circuit3 = square.calculateCircuit(6,6);
        System.out.println("area square= " + area3);
        System.out.println("circuit square= " + circuit3);

    }
}
