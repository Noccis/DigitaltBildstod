package com.example.digitaltbildstd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActionStepsActivity : AppCompatActivity() {

    val testActionSteps = ActionsListManager.listOfActions[0].listOfSteps

    var a1 = Action( R.drawable.vardag2, false)

    var a10 = Action( R.drawable.sleep, false)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_steps)

        ActionsListManager.listOfActions[0].listOfSteps.add(a1)
        ActionsListManager.listOfActions[0].listOfSteps.add(a1)
        ActionsListManager.listOfActions[0].listOfSteps.add(a1)
        ActionsListManager.listOfActions[0].listOfSteps.add(a10)
        ActionsListManager.listOfActions[0].listOfSteps.add(a10)
        ActionsListManager.listOfActions[0].listOfSteps.add(a10)
        ActionsListManager.listOfActions[0].listOfSteps.add(a10)
        ActionsListManager.listOfActions[0].listOfSteps.add(a10)
        
        val recyclerView = findViewById<RecyclerView>(R.id.stepsRecycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = StepsRecycleAdapter(this, ActionsListManager.listOfActions[0].listOfSteps)
        recyclerView.adapter = adapter



    }
}