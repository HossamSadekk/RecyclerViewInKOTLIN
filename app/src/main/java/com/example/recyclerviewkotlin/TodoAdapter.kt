package com.example.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TodoAdapter(val todosList: List<Todo>) : RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        //Use attachToRoot = true when you want to add the childView to parent right now.
        //Use attachToRoot = false when you want to add the childView to parent at later point.
        //You should also use attachToRoot = false When you are not responsible for adding the childView.
        return  TodoViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_todo,parent,false))
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.apply {
            txtTitle?.setText(todosList[position].Title)
            isCheckedbool?.isChecked = todosList[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return todosList.size
    }

    inner class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var txtTitle: TextView? = null
        var isCheckedbool: CheckBox? = null
        init {
            this.txtTitle  = itemView.findViewById<TextView>(R.id.Title)
            this.isCheckedbool  = itemView.findViewById<CheckBox>(R.id.Checkbox)
        }
    }
}