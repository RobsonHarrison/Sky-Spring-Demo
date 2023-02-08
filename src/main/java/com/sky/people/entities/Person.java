package com.sky.people.entities;

public class Person {

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }

//    REQUIRED GETTERS AND SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    private String job;
}
