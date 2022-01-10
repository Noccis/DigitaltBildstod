package com.example.digitaltbildstd.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Step
    (
    @PrimaryKey // Kommer autogenerera ett id
    val Stepid: Int,
    val stepImage: Int,
    val actionParentId: Int
)