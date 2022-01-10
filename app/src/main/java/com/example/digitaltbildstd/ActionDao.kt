package com.example.digitaltbildstd

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.digitaltbildstd.entities.Action

interface ActionDao {

    @Insert
    fun insert(action: Action)

    @Delete
    fun delete(action: Action)

    @Query("SELECT * FROM action_table")
    fun getAll() : List<Action>

}

/*
@Dao
interface WordDao {

    @Insert
    fun insert(word: Word)

    @Delete
    fun delete(word: Word)

    @Query("SELECT * FROM word_table")
    fun getAll() : List<Word>

}
 */