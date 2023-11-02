package org.example;

import java.time.LocalDate;

public class Subject {
    private String name;
    private String assesment;
    private LocalDate date;
    private LocalDate actualDate;
    private SubjectType type;

    public Subject(String name, String assesment, LocalDate date, LocalDate actualDate, SubjectType type) {
        this.name = name;
        this.assesment = assesment;
        this.date = date;
        this.actualDate = actualDate;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getAssesment() {
        return assesment;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalDate getActualDate() {
        return actualDate;
    }

    public SubjectType getType() {
        return type;
    }
}
