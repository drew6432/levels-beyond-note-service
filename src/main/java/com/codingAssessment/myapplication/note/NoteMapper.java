package com.codingAssessment.myapplication.note;


final class NoteMapper {

    static Note mapToEntity(NoteDTO dto) {
        if (dto == null) {
            return null;
        }
        Note noteEntity = new Note();
        noteEntity.setId(dto.getId());
        noteEntity.setBody(dto.getBody());

        return noteEntity;
    }

    static  NoteDTO mapEntityToDTO(Note noteEntity) {
        if (noteEntity == null) {
            return null;
        }
        NoteDTO dto = new NoteDTO();
        dto.setId(noteEntity.getId());
        dto.setBody(noteEntity.getBody());

        return dto;
    }
}
