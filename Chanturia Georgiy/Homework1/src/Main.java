import Homework1.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount of person: ");
        int amountOfPerson = scanner.nextInt();

        Person[] people = new Person[amountOfPerson];

        for (int i = 0; i < amountOfPerson; i++) {
            people[i] = new Person();
            System.out.println("Enter information for person " + (i + 1));
            people[i].input();
        }

        System.out.println("Details of the entered people:");
        for (Person person : people) {
            person.output();
        }
    }
}