package com.example.digitaltbildstd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActionsActivity : AppCompatActivity() {

val TAG = "dodo"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actions)

        createStepList()



        val recyclerView = findViewById<RecyclerView>(R.id.actionsRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = ActionRecycleAdapter(this, ActionsListManager.listOfActions)

        recyclerView.adapter = adapter
    }


    fun createStepList() {

        var a1 = Action( R.drawable.vardag2, false)
        var a10 = Action( R.drawable.sleep, false)

        for (action in ActionsListManager.listOfActions) {

            action.listOfSteps.add(a1)
            action.listOfSteps.add(a1)
            action.listOfSteps.add(a1)
            action.listOfSteps.add(a10)
            action.listOfSteps.add(a10)
            action.listOfSteps.add(a10)

            Log.d(TAG, "createStepList: list size ${action.listOfSteps.size}")

        }

    }

}