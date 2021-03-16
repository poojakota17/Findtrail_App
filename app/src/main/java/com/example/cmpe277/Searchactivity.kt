package com.example.cmpe277

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class Searchactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchactivity)
    }

    fun viewdetails(view: View) {
     val text= findViewById<EditText>(R.id.inputlocation)
      val  textvalue=text.text
        Toast.makeText( this,"location is $textvalue",Toast.LENGTH_LONG).show()

    }
}