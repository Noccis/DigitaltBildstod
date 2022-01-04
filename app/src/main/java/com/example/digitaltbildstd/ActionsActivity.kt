package com.example.digitaltbildstd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActionsActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actions)



        val recyclerView = findViewById<RecyclerView>(R.id.actionsRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = ActionRecycleAdapter(this, ActionsListManager.listOfActions)

        recyclerView.adapter = adapter
    }




}