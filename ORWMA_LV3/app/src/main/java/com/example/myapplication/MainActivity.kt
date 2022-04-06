package com.example.myapplication

import CustomAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view

        for (i in 1..12) {
            data.add(ItemsViewModel(R.drawable.envelope_24,"Item"+i))


        }

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter


        findViewById<Button>(R.id.button_add).setOnClickListener {
            val input1 = findViewById<View>(R.id.add) as EditText
            val value1 = input1.text.toString()
            data.add(ItemsViewModel(R.drawable.envelope_24,value1))
            val adapter = CustomAdapter(data)
            recyclerview.adapter = adapter
        }


    }
}