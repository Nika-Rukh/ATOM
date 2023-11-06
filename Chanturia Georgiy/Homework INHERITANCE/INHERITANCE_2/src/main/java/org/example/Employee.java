package org.example;

public abstract class Employee implements Сalculate{
    private String name;
    private JobTitle title;
    private String employeeId;
    private String federalTaxIdMember;

    public Employee(String name, JobTitle title, String employeeId, String federalTaxIdMember) {
        this.name = name;
        this.title = title;
        this.employeeId = employeeId;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobTitle getTitle() {
        return title;
    }

    public void setTitle(JobTitle title) {
        this.title = title;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", title=" + title +
                ", employeeId='" + employeeId + '\'' +
                ", federalTaxIdMember='" + federalTaxIdMember + '\'';
    }
}
