package com.example.digitaltbildstd

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

 @Entity(tableName = "action_table")
data class Action(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @ColumnInfo(name = "image") var image: Int,
   @ColumnInfo(name = "done") var done: Boolean,
 //   @ColumnInfo(name = "image_text") var imageText: String,
  //  @ColumnInfo(name = "order") var order: Int,
   // @ColumnInfo(name = "steps")     var steps: Boolean
) {
     var listOfSteps = mutableListOf<Action>()

}

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