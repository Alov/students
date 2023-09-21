package me.alov.students.storage;

import me.alov.students.domain.Student;

public class InMemoryStudentStorage {

    private Student[] students = new Student[10];
    private int index = 0;

    public Student save(Student student) {
        student.setId(index);
        students[index] = student;
        index++;

        return student;
    }
}
