package com.codingAssessment.myapplication.note;

import org.junit.Test;

import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NoteControllerTest {

    @Mock
    NoteService noteService;


    @Test
    public void shouldFindById(){
        NoteService noteService = mock(NoteService.class);
        NoteDTO expectedNoteDTO = new NoteDTO();
        expectedNoteDTO.setId(1L);
        expectedNoteDTO.setBody("test1");
        NoteController controller = new NoteController(noteService);
        when(noteService.findById(1L)).thenReturn(expectedNoteDTO);

        NoteDTO actualNoteDTO = controller.findById(1L);

        assertEquals(expectedNoteDTO, actualNoteDTO);
    }

    @Test
    public void create(){
        NoteService noteService = mock(NoteService.class);
        NoteDTO expectedNoteDTO = new NoteDTO();
        expectedNoteDTO.setId(1L);
        expectedNoteDTO.setBody("test1");
        NoteController controller = new NoteController(noteService);
        when(noteService.create(expectedNoteDTO)).thenReturn(expectedNoteDTO);

        NoteDTO actualNoteDTO = controller.create(expectedNoteDTO);

        assertEquals(expectedNoteDTO, actualNoteDTO);
    }

    @Test
    public void delete(){
        NoteService noteService = mock(NoteService.class);
        NoteDTO expectedNoteDTO = new NoteDTO();
        expectedNoteDTO.setId(1L);
        expectedNoteDTO.setBody("test1");
        NoteController controller = new NoteController(noteService);
        when(noteService.delete(1L)).thenReturn(expectedNoteDTO);

        NoteDTO actualNoteDTO = controller.delete(1L);

        assertEquals(expectedNoteDTO, actualNoteDTO);
    }

    @Test
    public void update(){
        NoteService noteService = mock(NoteService.class);
        NoteDTO expectedNoteDTO = new NoteDTO();
        expectedNoteDTO.setId(1L);
        expectedNoteDTO.setBody("test1");
        NoteController controller = new NoteController(noteService);
        when(noteService.update(expectedNoteDTO)).thenReturn(expectedNoteDTO);

        NoteDTO actualNoteDTO = controller.update(expectedNoteDTO);

        assertEquals(expectedNoteDTO, actualNoteDTO);
    }

}
