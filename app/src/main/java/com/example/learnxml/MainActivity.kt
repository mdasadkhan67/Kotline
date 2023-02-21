package com.example.learnxml

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var kgNumber : EditText;
    lateinit var submitBtn : Button;
    lateinit var myResult : TextView;

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        kgNumber = findViewById(R.id.userInputKg)
        submitBtn = findViewById(R.id.submit)
        myResult = findViewById(R.id.result)

        submitBtn.setOnClickListener {

            val userInputNumString = kgNumber.text
            val userInputInt = Integer.parseInt(userInputNumString.toString())
            val ourResult = 2.205 * userInputInt
            Toast.makeText(this, "$ourResult", Toast.LENGTH_SHORT).show()
            myResult.text = ourResult.toString()


        }
    }


}