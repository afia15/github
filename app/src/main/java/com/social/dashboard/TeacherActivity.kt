package com.social.dashboard

import Adapter.myAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import data.ItemModel

class TeacherActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: myAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher)

        recyclerView = findViewById(R.id.recyclerViewTeacher)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Sample data
        val itemList = listOf(
            ItemModel("Teacher 1", "Description 1"),
            ItemModel("Teacher 2", "Description 2"),
            // Add more items here
        )

        adapter = myAdapter(itemList)
        recyclerView.adapter = adapter
    }
}
