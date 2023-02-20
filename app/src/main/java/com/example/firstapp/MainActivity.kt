package com.example.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myBtn : Button = findViewById(R.id.btn_increment)
        myBtn.setOnClickListener {
           increment()
        }
}

    private fun increment() {
        val textOfDisplay : TextView = findViewById(R.id.text_increment)
        val newNumber = Random.nextInt(6) +1
        textOfDisplay.text = newNumber.toString()



    }
}