package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a, b);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correct2 = ResultChecker.assertEquals(13, subtractResult);
        if (correct2) {
            System.out.println("metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }


        int exponentiationResult = calculator.exponentiation(a);
        boolean correct3 = ResultChecker.assertEquals(13, exponentiationResult);
        if (correct3) {
            System.out.println("Metoda exponentiation działa poprawnie dla liczby " + a);
            System.out.println(a + " * " + a + " = ");
        } else {
            System.out.println("Metoda exponentiation nie działa poprawnie dla liczby " + a);
        }

    }
}
