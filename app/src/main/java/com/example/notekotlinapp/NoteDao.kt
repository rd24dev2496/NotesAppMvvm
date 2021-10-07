package com.example.notekotlinapp

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface NoteDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
  suspend  fun  insert(nate: Note)

    @Delete
    fun  delete(nate: Note)

    @Query("select* from notes_table order by id ASC ")
    fun  getAllNotes(): LiveData<List<Note>>

}