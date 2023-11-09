package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.example.Student.printStudentsByCourse;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testPrintStudentsByCourse() {
        //1 - valid data
        List<Student> students1 = new ArrayList<>();

        students1.add(new Student("Ann", 1));
        students1.add(new Student("Jhon", 2));
        students1.add(new Student("Jim", 1));
        students1.add(new Student("Mike", 3));
        students1.add(new Student("Anastasiya", 2));

        String expected1 = "\nStudents in course 2:\n" + "Jhon\n" +
                "Anastasiya";
        String actual1 = printStudentsByCourse(students1, 2);

        assertEquals(expected1, actual1);

        //2 - empty list
        List<Student> students2 = new ArrayList<>();

        String expected2 = "The list of students is empty!";
        String actual2 = printStudentsByCourse(students2, 1);

        assertEquals(expected2, actual2);

        //3 - non existing course
        List<Student> students3 = new ArrayList<>();

        students3.add(new Student("Ann", 1));
        students3.add(new Student("Jhon", 2));
        students3.add(new Student("Jim", 1));
        students3.add(new Student("Mike", 3));
        students3.add(new Student("Anastasiya", 2));

        String expected3 = "On " + 5 + " course no students";
        String actual3 = printStudentsByCourse(students3, 5);

        assertEquals(expected3, actual3);
    }
}