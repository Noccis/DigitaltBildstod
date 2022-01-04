package com.example.digitaltbildstd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

const val ACTIONPOSITIONKEY = "actionPosition"
class ActionStepsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_steps)

        val actionPosition = intent.getIntExtra(ACTIONPOSITIONKEY, 0)



        val recyclerView = findViewById<RecyclerView>(R.id.stepsRecycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = StepsRecycleAdapter(this, ActionsListManager.listOfActions[0].listOfSteps)
        recyclerView.adapter = adapter



    }


}