package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var addTodo : Button
    lateinit var todoText : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addTodo = findViewById<Button>(R.id.btnTodo)
        todoText = findViewById<EditText>(R.id.etTodo)

        var todoslist = mutableListOf<Todo>(
            Todo("Android Course",true),
            Todo("html Course",true),
            Todo("css Course",false),
            Todo("js Course",true),
            Todo("python Course",false),
            Todo("ruby Course",true),
            Todo("Go Course",false),
            Todo("kotlin Course",false),
        )
        val adapter = TodoAdapter(todoslist)
        var recycler = findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = adapter
        recycler.layoutManager = LinearLayoutManager(this)

        // handle add new todo
        addTodo.setOnClickListener {
            val txt = todoText.text.toString()
            val todo = Todo(txt,false)
            todoslist.add(todo)
            adapter.notifyItemInserted(todoslist.size-1)
        }
    }
}