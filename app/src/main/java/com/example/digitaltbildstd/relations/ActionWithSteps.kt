package com.example.digitaltbildstd.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.digitaltbildstd.entities.Action
import com.example.digitaltbildstd.entities.Step

data class ActionWithSteps (
    @Embedded val action: Action,
    @Relation(
        parentColumn = "actionId",
        entityColumn = "actionParentId"
    )
    val steps: List<Step>
)