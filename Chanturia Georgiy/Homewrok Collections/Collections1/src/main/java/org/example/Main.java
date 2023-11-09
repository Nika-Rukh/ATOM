package org.example;

import java.util.*;

public class Main {
    public static String printMapJoin(Map<String, String> map){
        StringBuilder sb = new StringBuilder();
        List<String> listString = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            listString.add("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue());
        }
        return String.join("\n", listString);
    };

    public static String printMapDelete(Map<String, String> map){
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append("Last Name: " + entry.getKey() + ", First Name: " + entry.getValue()).append("\n");
        }

        if (sb.length() > 0) {
            sb.delete(sb.length() - 1, sb.length());
        }

        return sb.toString();
    };

    public static void main(String[] args) {
        Map<String, String> personMap = new LinkedHashMap<>();

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
        System.out.println(printMapDelete(personMap));

        personMap.values().removeIf(firstName -> firstName.equals("Orest"));

        System.out.println("\nPersons in the map after removing 'Orest':");
        System.out.println(printMapJoin(personMap));
    }
}