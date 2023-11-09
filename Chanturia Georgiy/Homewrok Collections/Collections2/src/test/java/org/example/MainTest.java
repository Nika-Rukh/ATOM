package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testPrintStudent() {
        //1 - valid data
        List<Student> students1 = new ArrayList<>();

        students1.add(new Student("Ann", 1));
        students1.add(new Student("Jhon", 2));

        String expected1 = "Name: Ann, First Name: 1\n" +
                "Name: Jhon, First Name: 2";
        String actual1 = Main.printStudent(students1);
        assertEquals(expected1, actual1);

        //2 - empty list
        List<Student> students2 = new ArrayList<>();

        String expected2 = "";
        String actual2 = Main.printStudent(students2);
        assertEquals(expected2, actual2);
    }
}