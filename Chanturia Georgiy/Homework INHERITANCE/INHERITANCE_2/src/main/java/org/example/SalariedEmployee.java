package org.example;

public class SalariedEmployee extends Employee{
    double hourlyRate;
    double hoursAmount;

    public SalariedEmployee(String name, JobTitle title, String employeeId, String federalTaxIdMember, double hourlyRate, double hoursAmount) {
        super(name, title, employeeId, federalTaxIdMember);
        this.hourlyRate = hourlyRate;
        this.hoursAmount = hoursAmount;
    }

    public double calculatePay(){
        return hourlyRate * hoursAmount;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                " hourlyRate=" + hourlyRate +
                ", hoursAmount=" + hoursAmount +
                '}';
    }
}
