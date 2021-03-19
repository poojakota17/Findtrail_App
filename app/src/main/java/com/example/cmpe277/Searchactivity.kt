package com.example.cmpe277

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
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
        val intent = Intent(this, viewdetails::class.java ).apply{ putExtra(EXTRA_MESSAGE,textvalue ) }
        startActivity(intent)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
         super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK){
            Toast.makeText( this,"Activity result received",Toast.LENGTH_LONG).show()
        }
    }


}