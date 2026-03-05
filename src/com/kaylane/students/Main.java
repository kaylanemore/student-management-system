package com.kaylane.students;

import com.kaylane.students.model.Student;
import com.kaylane.students.service.StudentService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService service = new StudentService();

        int option;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1 - Register student");
            System.out.println("2 - List students");
            System.out.println("3 - Search student");
            System.out.println("4 - Remove student");
            System.out.println("0 - Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            if (option == 1) {

                System.out.print("Student name: ");
                String name = scanner.nextLine();

                System.out.print("First grade: ");
                double grade1 = scanner.nextDouble();

                System.out.print("Second grade: ");
                double grade2 = scanner.nextDouble();
                scanner.nextLine();

                Student student = new Student(name, grade1, grade2);
                service.addStudent(student);

                System.out.println("Student registered.");

            }

            else if (option == 2) {

                service.listStudents();

            }

            else if (option == 3) {

                System.out.print("Enter student name: ");
                String name = scanner.nextLine();

                service.findStudentByName(name);

            }

            else if (option == 4) {

                System.out.print("Enter student name to remove: ");
                String name = scanner.nextLine();

                service.removeStudent(name);

            }

        } while (option != 0);

        System.out.println("Program finished.");

    }
}