package me.alov.students.service;

import me.alov.students.domain.Student;

import java.time.LocalDate;

public class StudentService {



    public void addStudent(String firstName, String lastName, String paternalName, LocalDate birthDate, String group) {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setPaternalName(paternalName);
        student.setGroup(group);
    }
}
