package org.example;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testPrintMapJoin() {
        Map<String, String> personMap = new LinkedHashMap<>();

        personMap.put("Doe", "John");
        personMap.put("Smith", "Alice");

        String expected = "Last Name: Doe, First Name: John\n" +
                "Last Name: Smith, First Name: Alice";
        String actual = Main.printMapJoin(personMap);
        assertEquals(expected, actual);
    }

    @Test
    void testPrintMapDelte() {
        Map<String, String> personMap = new LinkedHashMap<>();

        personMap.put("Doe", "John");
        personMap.put("Smith", "Alice");

        String expected = "Last Name: Doe, First Name: John\n" +
                "Last Name: Smith, First Name: Alice";
        String actual = Main.printMapDelete(personMap);
        assertEquals(expected, actual);
    }
}