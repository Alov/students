package me.alov.students.domain;

import java.time.LocalDate;

class Person {

    private int id;
    private String firstName;
    private String lastName;
    private String paternalName;
    private LocalDate birthDate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPaternalName() {
        return paternalName;
    }

    public void setPaternalName(String paternalName) {
        this.paternalName = paternalName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    public Person(int id, String firstName, String lastName, String paternalName, LocalDate birthDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.paternalName = paternalName;
        this.birthDate = birthDate;
    }

    public Person() {
    }
}
