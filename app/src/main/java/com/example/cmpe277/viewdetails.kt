package com.example.cmpe277

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.EditText
import android.widget.Toast
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
    fun traildetails(view: View) {
        //val text= findViewById<EditText>(R.id.textView)
        val  textvalue="abcd"
//        Toast.makeText( this,"location is $textvalue", Toast.LENGTH_LONG).show()
        val intent = Intent(this, traildetail::class.java ).apply{ putExtra(AlarmClock.EXTRA_MESSAGE,textvalue ) }
        startActivity(intent)

    }
}

