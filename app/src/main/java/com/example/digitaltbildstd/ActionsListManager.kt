package com.example.digitaltbildstd

import android.util.Log

object ActionsListManager {

    val TAG = "dodo"
    var listOfActions = mutableListOf<Action >()

    init {
        createMockData()
      //  Log.d(TAG, ":created moc data! ")
    //    Log.d(TAG, "MockData size: ${ActionsListManager.listOfActions.size}")
    }

    fun createMockData() {

        var a1 = Action( R.drawable.vardag1, false)
        var a2 = Action( R.drawable.vardag2, false)
        var a3 = Action( R.drawable.vardag3och13, false)
        var a4 = Action( R.drawable.outdoorclothes, false)
        var a5 = Action( R.drawable.car, false)
        var a6 = Action( R.drawable.school, false)
        var a7 = Action( R.drawable.car, false)
        var a8 = Action( R.drawable.shower, false)
        var a9 = Action( R.drawable.tablet, false)
        var a10 = Action( R.drawable.sleep, false)

        listOfActions.add(a1)
        listOfActions.add(a2)
        listOfActions.add(a3)
        listOfActions.add(a4)
        listOfActions.add(a5)
        listOfActions.add(a6)
        listOfActions.add(a7)
        listOfActions.add(a8)
        listOfActions.add(a9)
        listOfActions.add(a10)

    }
}