package com.example.lessonroom.domain

import com.example.lessonroom.data.model.NoteModel

class GetNoteUseCase (private val repository: NoteRepository)  {
    fun getNoteById(id: String): NoteModel{
        return repository.get(id)
    }

    fun getNotes(): Map<String, String>{

    }
}