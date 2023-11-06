package org.example;

public class ContractEmployee extends Employee{
    double monthlyPayment;

    public ContractEmployee(String name, JobTitle title, String employeeId, String federalTaxIdMember, double monthlyPayment) {
        super(name, title, employeeId, federalTaxIdMember);
        this.monthlyPayment = monthlyPayment;
    }

    public double getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(double monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public double calculatePay(){
        return monthlyPayment;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" + super.toString() +
                " monthlyPayment=" + monthlyPayment +
                '}';
    }
}
