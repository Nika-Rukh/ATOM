package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("Jhon", JobTitle.DATABASE_ADMINISTRATOR, "1", "123-45-6789", 3.5, 200),
                new SalariedEmployee("Jake", JobTitle.SOFTWARE_DEVELOPER, "2", "223-45-6789", 8.5, 120),
                new SalariedEmployee("Jim", JobTitle.WEB_DEVELOPER, "3", "323-45-6789", 4.5, 80),
                new SalariedEmployee("Mike", JobTitle.SYSTEM_ADMINISTRATOR, "4", "423-45-6789", 5, 100),
                new SalariedEmployee("Jerremmy", JobTitle.CLOUD_ADMINISTRATOR, "5", "523-45-6789", 5, 150),
                new ContractEmployee("Yuri", JobTitle.MACHINE_LEARNING_ENGINEER, "6", "121-45-6789", 600),
                new ContractEmployee("Dmitriy", JobTitle.QA_ENGINEER, "7", "122-45-6789", 60),
                new ContractEmployee("Nadya", JobTitle.INFORMATION_SECURITY_ENGINEER, "8", "123-45-6789", 60),
                new ContractEmployee("Anna", JobTitle.BUSINESS_ANALYST, "9", "124-45-6789", 60),
                new ContractEmployee("Diana", JobTitle.CLOUD_SOLUTIONS_ARCHITECT, "10", "125-45-6789", 60)
        };

        System.out.printf("All array before sorting \n");
        for(Employee employee : employees){
            System.out.printf(employee.toString());
        }

        System.out.printf("Name, id and salary\n");
        for(Employee employee : employees){
            System.out.printf("Name " + employee.getName() + " Id " + employee.getEmployeeId() + " Salary " + employee.calculatePay() + "\n");
        }

        Comparator<Employee> monthlyPaymentComparator = Comparator.comparingDouble(Employee::calculatePay);
        Arrays.sort(employees, monthlyPaymentComparator.reversed());

        System.out.printf("\nArray after sorting \n");
        for(Employee employee : employees){
            System.out.printf(employee.toString());
        }

        System.out.printf("Name, id and salary\n");
        for(Employee employee : employees){
            System.out.printf("Name " + employee.getName() + " Id " + employee.getEmployeeId() + " Salary " + employee.calculatePay() + "\n");
        }
    }
}