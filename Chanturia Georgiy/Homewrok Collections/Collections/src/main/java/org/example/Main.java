package org.example;

import java.util.HashSet;
import java.util.Set;

import static org.example.SetOperations.intersection;
import static org.example.SetOperations.union;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<String> set3 = new HashSet<>();
        Set<String> set4 = new HashSet<>();
        Set<Double> set5 = new HashSet<>();
        Set<Double> set6 = new HashSet<>();


        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(2);
        set2.add(3);
        set2.add(4);

        set3.add("1.1");
        set3.add("2");
        set3.add("3.3");

        set4.add("1");
        set4.add("2");
        set4.add("3");

        set5.add(1.1);
        set5.add(2.0);
        set5.add(3.3);

        set6.add(1.2);
        set6.add(0.2);
        set6.add(3.3);

        Set<Integer> unionResult1 = union(set1, set2);
        System.out.println("Set1: " + set1 + "\nSet2: " + set2 + "\nUnion of set1 and set2: " + unionResult1);

        Set<Integer> intersectResult1 = intersection(set1, set2);
        System.out.println("Set1: " + set1 + "\nSet2: " + set2 + "\nIntersection of set1 and set2: " + intersectResult1);

        Set<String> unionResult2 = union(set3, set4);
        System.out.println("Set3: " + set1 + "\nSet4: " + set2 + "\nUnion of set3 and set4: " + unionResult2);

        Set<String> intersectResult2 = intersection(set3, set4);
        System.out.println("Set3: " + set3 + "\nSet4: " + set4 + "\nIntersection of set4 and set4: " + intersectResult2);

        Set<Double> unionResult3 = union(set5, set6);
        System.out.println("Set5: " + set5 + "\nSet6: " + set6 + "\nUnion of set5 and set6: " + unionResult3);

        Set<Double> intersectResult3 = intersection(set5, set6);
        System.out.println("Set5: " + set5 + "\nSet6: " + set6 + "\nIntersection of set4 and set4: " + intersectResult3);
    }
}