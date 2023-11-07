package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<>();

        personMap.put("Doe", "John");
        personMap.put("Smith", "Alice");
        personMap.put("Johnson", "Bob");
        personMap.put("Brown", "Alice");
        personMap.put("Davis", "David");
        personMap.put("Wilson", "Emma");
        personMap.put("Taylor", "Orest");
        personMap.put("Lee", "Mary");
        personMap.put("Clark", "Orest");
        personMap.put("Anderson", "Grace");

        System.out.println("Persons in the map:");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }

        personMap.values().removeIf(firstName -> firstName.equals("Orest"));

        System.out.println("\nPersons in the map after removing 'Orest':");
        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            System.out.println("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }
    }
}