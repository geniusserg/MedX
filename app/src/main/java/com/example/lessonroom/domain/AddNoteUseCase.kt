package com.example.lessonroom.domain

import com.example.lessonroom.data.model.NoteModel

class AddNoteUseCase (private val repository: NoteRepository) {
    fun addNote(model: NoteModel){
        repository.add(model)
    }
}