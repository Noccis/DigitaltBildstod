package com.example.digitaltbildstd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.*
import kotlin.coroutines.CoroutineContext

class ActionsActivity : AppCompatActivity() , CoroutineScope {

    private lateinit var job : Job
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main + job

    lateinit var db : AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actions)

        job = Job()

        db = AppDatabase.getInstance(this)

        val recyclerView = findViewById<RecyclerView>(R.id.actionsRecyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = ActionRecycleAdapter(this, ActionsListManager.listOfActions)

        recyclerView.adapter = adapter
    }

    fun addNewWord(action: Action) {

        launch(Dispatchers.IO) {
            db.actionDao.insert(action)
        }

    }

    fun loadAllWords() {

        val actions = async(Dispatchers.IO)
        {
            db.actionDao.getAll()

        }
        launch {
            val list = actions.await().toMutableList()
            ActionsListManager.listOfActions = list
        }
    }

    /*
     fun loadAllWords() {
        val words = async(Dispatchers.IO) {
            db.wordDao.getAll()
        }

        launch {
            val list = words.await().toMutableList()
            wordList = WordList(list)
            loadNewWord()
        }
    }
     */


}