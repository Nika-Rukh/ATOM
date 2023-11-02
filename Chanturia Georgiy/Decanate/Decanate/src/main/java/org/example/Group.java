package org.example;
import java.time.LocalDate;

import java.util.List;

public class Group {
    private String number;
    private LocalDate yearCreated;
    private List<Student> students;

    public Group(String number, LocalDate yearCreated, List<Student> students) {
        this.number = number;
        this.yearCreated = yearCreated;
        this.students = students;
    }

    public String getNumber() {
        return number;
    }

    public LocalDate getYearCreated() {
        return yearCreated;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setYearCreated(LocalDate yearCreated) {
        this.yearCreated = yearCreated;
    }

    @Override
    public String toString() {
        return "Group{" +
                "number='" + number + '\'' +
                ", yearCreated=" + yearCreated +
                ", students=" + students +
                '}';
    }
}
