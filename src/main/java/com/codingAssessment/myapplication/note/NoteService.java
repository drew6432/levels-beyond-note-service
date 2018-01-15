package com.codingAssessment.myapplication.note;

import java.util.List;
import java.util.Optional;

public interface NoteService {

    NoteDTO create(NoteDTO newNote);

    NoteDTO delete(Long id);

    List<NoteDTO> findAll(Optional<String> opt);

    NoteDTO findById(Long id);

    NoteDTO update(NoteDTO updatedNote);
}
