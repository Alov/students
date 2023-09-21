package me.alov.students.domain;

import java.time.LocalDateTime;

public class Lecture {

    private Subject subject;
    private LocalDateTime start;
    private LocalDateTime end;

    public Lecture() {
    }

    public Lecture(Subject subject, LocalDateTime start, LocalDateTime end) {
        this.subject = subject;
        this.start = start;
        this.end = end;
    }
}
