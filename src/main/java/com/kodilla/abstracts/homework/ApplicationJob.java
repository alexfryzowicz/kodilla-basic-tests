package com.kodilla.abstracts.homework;

public class ApplicationJob {
    public static void main(String[] args) {
       Person person = new Person("Miki", 32, new Driver());
       person.showResponsibilities();

        Person person1 = new Person("Alex", 29, new QAEngineer());
        person1.showResponsibilities();
    }
}
