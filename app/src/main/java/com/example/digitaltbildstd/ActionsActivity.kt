package com.example.digitaltbildstd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActionsActivity : AppCompatActivity() {

    var listOfActions = mutableListOf<Action>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actions)

        createMockData()

    }

    fun createMockData() {

        var a1 = Action( R.drawable.vardag1, false)
        var a2 = Action( R.drawable.vardag2, false)
        var a3 = Action( R.drawable.vardag3och13, false)
        var a4 = Action( R.drawable.outdoorclothes, false)
        var a5 = Action( R.drawable.sleep, false)

        listOfActions.add(a1)
        listOfActions.add(a2)
        listOfActions.add(a3)
        listOfActions.add(a4)
        listOfActions.add(a5)

    }


}