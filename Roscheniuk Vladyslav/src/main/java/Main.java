public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Emmie", 2006);
        Person secondPerson = Person.inputPersonData();

        firstPerson.getName();
        secondPerson.getBirthYear();

        firstPerson.displayPersonData();
        firstPerson.changePersonName("Itan");

        firstPerson.displayPersonData();
        secondPerson.displayPersonData();

    }
}