package org.example;


import java.util.*;

import static org.example.Student.getStudentsByCourse;

public class Main {
    public static String printStudent(List<Student> students){
        StringBuilder sb = new StringBuilder();
        List<String> listString = new ArrayList<>();
        for (Student student : students) {
            listString.add("Name: " + student.getName() + ", First Name: " + student.getCourse());
        }
        return String.join("\n", listString);
    };

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Ann", 1));
        students.add(new Student("Jhon", 2));
        students.add(new Student("Jim", 1));
        students.add(new Student("Mike", 3));
        students.add(new Student("Anastasiya", 2));

        System.out.println("Initial list:");
        System.out.println(printStudent(students));

        Collections.sort(students, Comparator.comparing(Student::getName));
        System.out.println("\nStudents ordered by name:");
        System.out.println(printStudent(students));

        Collections.sort(students, Comparator.comparing(Student::getCourse));
        System.out.println("\nStudents ordered by course:");
        System.out.println(printStudent(students));

        System.out.println(getStudentsByCourse(students, 2));
    }
}