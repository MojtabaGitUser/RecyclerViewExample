package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val exampleList = generateList(300)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ExampleAdapter(exampleList)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
    }
    private fun generateList(size:Int):List<ExampleItem>{
        val list = ArrayList<ExampleItem>()
        for(i in 0 until size){
            val drawable = when (i%3) {
                0 -> R.drawable.ic_4k
                1 -> R.drawable.ic_audiotrack
                else -> R.drawable.ic_wb_sunny
            }
            val item= ExampleItem(drawable,"Item $i","Line 2")
            list += item

            }
        return list
        }
}
