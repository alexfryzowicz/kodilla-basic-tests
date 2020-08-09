package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void showResponsibilities() {
        System.out.println("name: " + firstName + " " + "age: " + " " + age + " " + "responsibilities: " + job.getResponsibilities()  );
    }
}
