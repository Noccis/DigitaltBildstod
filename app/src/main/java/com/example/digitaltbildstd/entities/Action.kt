package com.example.digitaltbildstd.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "action_table")
data class Action(
    @PrimaryKey(autoGenerate = true) val id: Int,
    var image: Int,
    var done: Boolean,
    //   @ColumnInfo(name = "image_text") var imageText: String,
    //  @ColumnInfo(name = "order") var order: Int,
    // @ColumnInfo(name = "steps")     var steps: Boolean
)

/*

@Entity(tableName = "users")
data class User (
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?
)

@Entity(tableName = "word_table")
data class Word(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "english") var english : String,
    @ColumnInfo(name= "swedish") var swedish: String)
 */