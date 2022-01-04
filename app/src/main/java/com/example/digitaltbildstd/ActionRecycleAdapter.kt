package com.example.digitaltbildstd

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView

class ActionRecycleAdapter(val context : Context, val actions: MutableList<Action>) : RecyclerView.Adapter<ActionRecycleAdapter.ViewHolder>() {

    val layoutInflater = LayoutInflater.from(context)

    override fun getItemCount(): Int {
        return actions.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.list_item, parent, false)
        return ViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val action = actions[position]
        holder.actionImageView.setImageResource(action.image)
        holder.actionCheckbox.isChecked = action.done
        holder.actionPosition = position

    }


    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val actionImageView = itemView.findViewById<ImageView>(R.id.actionImageView)
        val actionCheckbox = itemView.findViewById<CheckBox>(R.id.stepCheckBox)
        var actionPosition = 0

        init {
            itemView.setOnClickListener {
                val intent = Intent(context, ActionStepsActivity::class.java)
                intent.putExtra( ACTIONPOSITIONKEY, actionPosition)
                context.startActivity(intent)
            }
        }


    }


}