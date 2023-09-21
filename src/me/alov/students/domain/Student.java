package me.alov.students.domain;

import java.time.LocalDate;

public class Student extends Person {

    private String group;

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Student() {

    }

    public Student(int id, String firstName, String lastName, String paternalName, LocalDate birthDate, String group) {
        super(id, firstName, lastName, paternalName, birthDate);
        this.group = group;
    }
}
