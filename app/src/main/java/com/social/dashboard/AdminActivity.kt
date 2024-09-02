package com.social.dashboard

import Adapter.myAdapter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import data.ItemModel

class AdminActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: myAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)

        recyclerView = findViewById(R.id.recyclerViewAdmin)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Sample data
        val itemList = listOf(
            ItemModel("Admin 1", "Description 1"),
            ItemModel("Admin 2", "Description 2"),
            // Add more items here
        )

        adapter = myAdapter(itemList)
        recyclerView.adapter = adapter
    }
}