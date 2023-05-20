package com.example.kotlinpertama

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Rolldice : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rolldice)
        var banyakputaran=3

            val acakdadu: Button = findViewById(R.id.buttonAcak)
            acakdadu.setOnClickListener {

                println("$banyakputaran ini dalam button")
                if (banyakputaran > 0) {
                    val diceImage: ImageView = findViewById(R.id.imageView2)
                    val number = Random.nextInt(1, 6)
                    number.toString()


                    val coba = R.drawable.dice_2
                    val gambardadu =
                        resources.getIdentifier("dice_$number", "drawable", packageName)
                    diceImage.setImageResource(gambardadu)
                    --banyakputaran

                    println("$banyakputaran ini dalam if")

                }
                else{
                    val intent = Intent(this, Cardgame::class.java)
                    startActivity(intent)

                }

                }






            }


        }




















