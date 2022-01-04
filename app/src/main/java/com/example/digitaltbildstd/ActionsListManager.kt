package com.example.digitaltbildstd

import android.util.Log

object ActionsListManager {

   // val TAG = "dodo"
    var listOfActions = mutableListOf<Action >()

    init {
        if (listOfActions.size == 0) {
            createMockData()
            createBrushteethSteps()
            createtoiletSteps()
        }
      //  Log.d(TAG, ":created moc data! ")
    //    Log.d(TAG, "MockData size: ${ActionsListManager.listOfActions.size}")
    }

    fun createMockData() {

        var a1 = Action( R.drawable.pee, false)
        var a2 = Action( R.drawable.breakfast, false)
        var a3 = Action( R.drawable.clothes, false)
        var a4 = Action( R.drawable.outdoorclothes, false)
        var a5 = Action( R.drawable.car, false)
        var a6 = Action( R.drawable.school, false)
        var a7 = Action( R.drawable.car, false)
        var a8 = Action( R.drawable.brushteeth, false)
        var a9 = Action( R.drawable.tablet, false)
        var a10 = Action( R.drawable.pee, false)
        var a11 = Action( R.drawable.sleep, false)

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
        listOfActions.add(a11)



    }
    fun createtoiletSteps() {
        var step1 = Action( R.drawable.pantsdown, false)
        var step2 = Action( R.drawable.toa2, false)
        var step3 = Action( R.drawable.paper, false)
        var step4 = Action( R.drawable.pantsup, false)
        var step5 = Action( R.drawable.seatdown, false)
        var step6 = Action( R.drawable.flush, false)
        var step7 = Action( R.drawable.soap, false)
        var step8 = Action( R.drawable.washhands, false)
        var step9 = Action( R.drawable.dry, false)

        // Adds steps to pee Action
        listOfActions[0].listOfSteps.add(step1)
        listOfActions[0].listOfSteps.add(step2)
        listOfActions[0].listOfSteps.add(step3)
        listOfActions[0].listOfSteps.add(step4)
        listOfActions[0].listOfSteps.add(step5)
        listOfActions[0].listOfSteps.add(step6)
        listOfActions[0].listOfSteps.add(step7)
        listOfActions[0].listOfSteps.add(step8)
        listOfActions[0].listOfSteps.add(step9)

        listOfActions[9].listOfSteps.add(step1)
        listOfActions[9].listOfSteps.add(step2)
        listOfActions[9].listOfSteps.add(step3)
        listOfActions[9].listOfSteps.add(step4)
        listOfActions[9].listOfSteps.add(step5)
        listOfActions[9].listOfSteps.add(step6)
        listOfActions[9].listOfSteps.add(step7)
        listOfActions[9].listOfSteps.add(step8)
        listOfActions[9].listOfSteps.add(step9)



    }

    fun createBrushteethSteps() {

        val bstep1 = Action(R.drawable.prepare, false)
        val bstep2 = Action(R.drawable.toothpaste, false)
        val bstep3 = Action(R.drawable.brushteeth, false)
        val bstep4 = Action(R.drawable.rinse, false)

        listOfActions[7].listOfSteps.add(bstep1)
        listOfActions[7].listOfSteps.add(bstep2)
        listOfActions[7].listOfSteps.add(bstep3)
        listOfActions[7].listOfSteps.add(bstep4)

    }
}