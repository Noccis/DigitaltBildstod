package com.example.digitaltbildstd

import android.content.Context
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
        // När en list_view ska visas så tar vi rätt action från vår lista.
        val action = actions[position]
        holder.actionImageView.setImageResource(action.image)
        holder.actionCheckbox.isChecked = action.done
//        holder.actionsPosition = position

    }



    inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
// När en viewholder skapas letar vi reda på våra views i vår itemView.
        val actionImageView = itemView.findViewById<ImageView>(R.id.actionImageView)
        val actionCheckbox = itemView.findViewById<CheckBox>(R.id.checkBox)

/*
        init {
            actionCheckbox.setOnClickListener {

                actions[position].done = actionCheckbox.isChecked
                if (actions[position].done) {

                    /*
                    val toDoActivity = context as ToDoActivity
                    toDoActivity.reward()
                    toDoActivity.stepIsDone(action[actionsPosition])

                     */
                }
                else {
                    /*
                    val toDoActivity = context as ToDoActivity
                    toDoActivity.uncheckCheckBox(action[actionsPosition])

                     */
                }
            }
        }

 */

    }


}