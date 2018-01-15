package com.codingAssessment.myapplication.note;

public class NoteNotFoundException extends RuntimeException {

    private final Long id;

    public NoteNotFoundException(Long id) {
        super();
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
