package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String firstName;
    private String secondName;
    private String scorebookNumber;
    private Group group;
    private List<Subject> subjects;

    public Student(String firstName, String secondName, String scorebookNumber, Group group, List<Subject> subjects) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.scorebookNumber = scorebookNumber;
        this.group = group;
        this.subjects = subjects;
    }

    public Student(String firstName, String secondName, String scorebookNumber, List<Subject> subjects) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.scorebookNumber = scorebookNumber;
        this.subjects = subjects;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getScorebookNumber() {
        return scorebookNumber;
    }

    public Group getGroup() {
        return group;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    private List<String> getSubjectsNames() {
        List<String> subjectsNames = new ArrayList<>();
        for(Subject subject : subjects){
            subjectsNames.add(subject.getName());
        }
        return subjectsNames;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setScorebookNumber(String scorebookNumber) {
        this.scorebookNumber = scorebookNumber;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", scorebookNumber='" + scorebookNumber + '\'' +
                ", group=" + group.getNumber() +
                ", subjects=" + getSubjectsNames() +
                '}';
    }
}
