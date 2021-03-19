package com.example.cmpe277

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class viewdetails : AppCompatActivity() {

   // private var layoutManager: RecyclerView.LayoutManager? = null
    //private var adapter: RecyclerView.Adapter<ParkListAdapter.ViewHolder>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_viewdetails)
val myRecyclerView: RecyclerView= findViewById(R.id.myRecyclerView)
     myRecyclerView.layoutManager= LinearLayoutManager(this)
       val adapter:ParkListAdapter = ParkListAdapter()
             // layoutManager= LinearLayoutManager(this)

        //myRecylcerView.layoutManager = layoutManager
      //  adapter= ParkListAdapter()
        myRecyclerView.adapter=adapter

    }
}

