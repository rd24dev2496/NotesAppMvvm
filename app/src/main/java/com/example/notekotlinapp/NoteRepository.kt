package com.example.notekotlinapp

import androidx.lifecycle.LiveData

class NoteRepository(private val noteDao :NoteDao) {
    val allNotes:  LiveData<List<Note>> = noteDao.getAllNotes()
    suspend fun insert(note: Note)
    {
        noteDao.insert(note)
    }
}