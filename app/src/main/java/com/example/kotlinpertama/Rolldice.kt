package com.example.kotlinpertama

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Rolldice : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.rolldice)

            val acakdadu:Button = findViewById(R.id.buttonAcak)
            acakdadu.setOnClickListener{
                val diceImage : ImageView = findViewById(R.id.imageView2)
                val number = Random.nextInt(1,6)
                number.toString()
                val coba = R.drawable.dice_2
                val gambardadu = resources.getIdentifier("dice_$number", "drawable", packageName)
                diceImage.setImageResource(gambardadu)


//                diceImage.setImageResource(coba)
                println(gambardadu.toString())
            }



            }
        }


