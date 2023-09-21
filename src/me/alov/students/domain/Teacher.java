package me.alov.students.domain;

import java.time.LocalDate;

public class Teacher extends Person {

    private String qualification;

    public Teacher(int id, String firstName, String lastName, String paternalName, LocalDate birthDate, String qualification) {
        super(id, firstName, lastName, paternalName, birthDate);
        this.qualification = qualification;
    }
}
