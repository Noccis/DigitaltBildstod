package com.example.digitaltbildstd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.digitaltbildstd.entities.Action
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

        var a4 = Action( 0, R.drawable.outdoorclothes, false)
        var a5 = Action( 0, R.drawable.car, false)
        var a6 = Action( 0, R.drawable.school, false)
        var a7 = Action( 0, R.drawable.car, false)
        var a8 = Action( 0, R.drawable.brushteeth, false)
        var a9 = Action( 0, R.drawable.tablet, false)
        var a10 = Action(0, R.drawable.pee, false)
        var a11 = Action( 0, R.drawable.sleep, false)

        addNewWord(a4)
        addNewWord(a5)
        addNewWord(a6)
        addNewWord(a7)
        addNewWord(a8)
        addNewWord(a11)
        addNewWord(a9)
        addNewWord(a10)

        loadAllWords()

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