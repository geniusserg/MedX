package com.example.lessonroom.domain

import com.example.lessonroom.data.model.NoteModel

interface NoteRepository {
    fun add(note: NoteModel): Boolean
    fun get(id: String): NoteModel
    fun getAll(): Map<String, String>
}