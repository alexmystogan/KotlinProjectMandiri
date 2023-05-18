package com.example.kotlinpertama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonNext = findViewById<Button>(R.id.buttonNext)
        buttonNext.setOnClickListener{
            val intent = Intent(this, Rolldice::class.java)
            startActivity(intent)
        }

    }
}