package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Group> groupList = new ArrayList<>();
        List<Student> computerScienceStudents = new ArrayList<>();
        List<Student> mathStudents = new ArrayList<>();
        List<Subject> computerScienceSubjects = new ArrayList<>();
        List<Subject> mathSubjects = new ArrayList<>();

        computerScienceSubjects.add(new Subject("Mathematical analysis", "Pass", LocalDate.of(2022,12,23), LocalDate.of(2022,12,27), SubjectType.TEST));
        computerScienceSubjects.add(new Subject("C programming", "50", LocalDate.of(2022,12,25), LocalDate.of(2022,12,25), SubjectType.EXAM));

        mathSubjects.add(new Subject("Mathematical analysis", "Fail", LocalDate.of(2022,12,21), LocalDate.of(2022,12,21), SubjectType.TEST));
        mathSubjects.add(new Subject("Analytic algebra", "72", LocalDate.of(2022,12,25), LocalDate.of(2022,12,25), SubjectType.EXAM));

        computerScienceStudents.add(new Student("Ivan", "Ivanov", "xa-10101", null, computerScienceSubjects));
        computerScienceStudents.add(new Student("Petr", "Petrov", "xa-10102", computerScienceSubjects));

        mathStudents.add(new Student("Max", "Maximov", "xa-10201", null, mathSubjects));
        mathStudents.add(new Student("Yuri", "Yurirov", "xa-10202", mathSubjects));

        Group computerScienceGroup = new Group("MF-31", LocalDate.of(2020,9,1), computerScienceStudents);
        Group mathGroup = new Group("M-11", LocalDate.of(2023,9,1), mathStudents);

        groupList.add(computerScienceGroup);
        groupList.add(mathGroup);

        for(Student student : computerScienceStudents){
            student.setGroup(computerScienceGroup);
        }

        for(Student student : mathStudents){
            student.setGroup(mathGroup);
        }

        /*System.out.printf(computerScienceGroup.toString() + "\n");
        System.out.printf(mathGroup.toString());*/

        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        while (choice != 0) {
            System.out.println("Enter number of choice: \n" + "1 - for print group\n" + "2 - for all groups\n" + "3 - for create group\n" + "0 - for stop program");
            choice = scanner.nextInt();
            scanner.nextLine(); // Очистка символа новой строки
            switch (choice) {
                case 1:
                    System.out.println("Enter number of group for print: \n");
                    String choiceGroup = scanner.nextLine();
                    boolean findGroup = false;
                    for(Group group : groupList){
                        if(group.getNumber().equals(choiceGroup)){
                            System.out.printf(group.toString() + "\n");
                            findGroup = true;
                        }
                    }
                    if (findGroup == false) {
                        System.out.println(("Group with number " + choiceGroup + " not found\n"));
                    }
                    break;
                case 2:
                    for(Group group : groupList){
                        System.out.printf(group.toString() + "\n");
                    }
                    break;
                case 3:
                    Scanner scanner3 = new Scanner(System.in);

                    System.out.println("Enter the group number: ");
                    String groupNumber = scanner3.nextLine();

                    System.out.println("Enter the start date (yyyy-MM-dd): ");
                    String startDateStr = scanner3.nextLine();
                    LocalDate startDate = LocalDate.parse(startDateStr);

                    List<Student> students = new ArrayList<>();
                    boolean continueAddingStudents = true;

                    while (continueAddingStudents) {
                        System.out.println("Enter first name: ");
                        String firstName = scanner3.nextLine();

                        System.out.println("Enter second name: ");
                        String secondName = scanner3.nextLine();

                        System.out.println("Enter score-book number: ");
                        String scorebookNumber = scanner3.nextLine();

                        List<Subject> subjects = new ArrayList<>();
                        boolean continueAddingSubjects = true;

                        while (continueAddingSubjects) {
                            System.out.println("Enter subject name: ");
                            String subjectName = scanner.nextLine();

                            System.out.println("Enter subject assesment: ");
                            String assesment = scanner.nextLine();

                            System.out.println("Enter a date (yyyy-MM-dd): ");
                            String dateStr = scanner.nextLine();

                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                            LocalDate date = LocalDate.parse(dateStr, formatter);

                            System.out.println("Enter a actual date (yyyy-MM-dd): ");
                            String actualDateStr = scanner.nextLine();

                            LocalDate actualDate = LocalDate.parse(actualDateStr, formatter);

                            System.out.println("Enter subject type (TEST, EXAM): ");
                            String subjectTypeStr = scanner.nextLine();
                            SubjectType subjectType = SubjectType.valueOf(subjectTypeStr);

                            subjects.add(new Subject(subjectName, assesment, date, actualDate, subjectType));

                            System.out.println("Do you want to add another subject? (yes/no): ");
                            String response = scanner.nextLine();
                            continueAddingSubjects = response.equalsIgnoreCase("yes");
                        }

                        students.add(new Student(firstName, secondName, scorebookNumber, subjects));

                        System.out.println("Do you want to add another student? (yes/no): ");
                        String response = scanner3.nextLine();
                        continueAddingStudents = response.equalsIgnoreCase("yes");
                    }

                    Group addedGroup = new Group(groupNumber, startDate, students);

                    for(Student student : students){
                        student.setGroup(addedGroup);
                    }

                    System.out.println("Group created: " + computerScienceGroup.toString());
                default:
            }
        }
    }
}