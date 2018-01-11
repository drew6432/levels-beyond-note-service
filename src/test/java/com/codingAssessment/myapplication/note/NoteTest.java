package com.codingAssessment.myapplication.note;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NoteTest {


    @Test
    public void shouldGetId(){
        Note note = new Note();
        note.setId(1L);
        note.setBody("test1");

        long id = note.getId();

        assertEquals(1L, id);
    }

    @Test
    public void shouldGetBody(){
        Note note = new Note();
        note.setId(1L);
        note.setBody("test1");

        String body = note.getBody();

        assertEquals("test1", body);
    }
}
