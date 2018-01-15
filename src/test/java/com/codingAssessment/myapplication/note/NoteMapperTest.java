package com.codingAssessment.myapplication.note;

import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class NoteMapperTest {

    @Mock
    NoteService noteService;


//    @Test
//    public void shouldMapEntityToDTO(){
//        NoteDTO expectedNoteDTO = new NoteDTO();
//        expectedNoteDTO.setId(1L);
//        expectedNoteDTO.setBody("test1");
//        Note note = new Note();
//        note.setId(1L);
//        note.setBody("test1");
//        NoteDTO actualNoteDTO = NoteMapper.mapEntityToDTO(note);
//
//        assertEquals(expectedNoteDTO, actualNoteDTO);
//    }
}
