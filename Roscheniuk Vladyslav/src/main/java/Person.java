import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;

    public Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String personName) {
        name = personName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int calculateAge() {
        int currentYear = LocalDate.now().getYear();
        int age = currentYear - birthYear;
        return age;
    }

    public static Person inputPersonData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name of Person: ");
        String name = scanner.nextLine();

        System.out.print("Enter birth year of Person: ");
        int birthYear = scanner.nextInt();

        return new Person(name, birthYear);
    }

    public void displayPersonData() {
        System.out.println("Person" +
                "\nName: " + name +
                "\nAge " + calculateAge() + " years old\n\n");
    }

    public void changePersonName(String changedName) {
        this.name = changedName;
    }
}
