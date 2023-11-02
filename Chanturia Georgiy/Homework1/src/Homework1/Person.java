package Homework1;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;

    public Person() {

    }
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    private int age(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        return year - birthYear;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter birth year: ");
        birthYear = scanner.nextInt();
    }

    public void output() {
        System.out.println("name = '" + name + '\'' +
                ", birthYear = " + birthYear + ", age = " + age());
    }

    public void changeName(String newName) {
        name = newName;
    }
}
