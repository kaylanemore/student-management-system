package com.kaylane.students.service;

import com.kaylane.students.model.Student;
import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void listStudents() {

        if (students.isEmpty()) {
            System.out.println("No students registered.");
            return;
        }

        for (Student s : students) {

            System.out.println("Name: " + s.getName());
            System.out.println("Average: " + s.calculateAverage());
            System.out.println("Status: " + s.getStatus());
            System.out.println("----------------------");

        }
    }

    public void findStudentByName(String name) {

        for (Student s : students) {

            if (s.getName().equalsIgnoreCase(name)) {

                System.out.println("Student found:");
                System.out.println("Name: " + s.getName());
                System.out.println("Average: " + s.calculateAverage());
                System.out.println("Status: " + s.getStatus());
                return;

            }
        }

        System.out.println("Student not found.");
    }

    public void removeStudent(String name) {

        for (Student s : students) {

            if (s.getName().equalsIgnoreCase(name)) {
                students.remove(s);
                System.out.println("Student removed.");
                return;
            }

        }

        System.out.println("Student not found.");
    }

}