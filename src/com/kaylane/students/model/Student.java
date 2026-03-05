package com.kaylane.students.model;

public class Student {

    private String name;
    private double grade1;
    private double grade2;

    public Student(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    public String getName() {
        return name;
    }

    public double calculateAverage() {
        return (grade1 + grade2) / 2;
    }

    public String getStatus() {
        if (calculateAverage() >= 7) {
            return "Approved";
        } else {
            return "Failed";
        }
    }

}