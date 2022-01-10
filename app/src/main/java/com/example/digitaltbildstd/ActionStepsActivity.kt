package com.example.digitaltbildstd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

const val ACTIONPOSITIONKEY = "actionPosition"
class ActionStepsActivity : AppCompatActivity() {

    lateinit var backButton: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_action_steps)
/*
        val actionPosition = intent.getIntExtra(ACTIONPOSITIONKEY, 0)

        backButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }


        val recyclerView = findViewById<RecyclerView>(R.id.stepsRecycleView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = StepsRecycleAdapter(this, ActionsListManager.listOfActions[actionPosition].listOfSteps)
        recyclerView.adapter = adapter

 */



    }




}