package com.example.digitaltbildstd

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class StepsRecycleAdapter (val context : Context, val actionSteps: MutableList<Action>) : RecyclerView.Adapter<StepsRecycleAdapter.ViewHolder>() {

    //val TAG = "dodo"
    val layoutInflater = LayoutInflater.from(context)

    override fun getItemCount(): Int {
        return actionSteps.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_step, parent, false)
        return ViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val action = actionSteps[position]
        holder.actionImageView.setImageResource(action.image)
        holder.actionCheckbox.isChecked = action.done

        Log.d(TAG, "onBindViewHolder: Action steps: ${position}")

    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val actionImageView = itemView.findViewById<ImageView>(R.id.stepsImageView)
        val actionCheckbox = itemView.findViewById<CheckBox>(R.id.stepCheckBox)


    }


}