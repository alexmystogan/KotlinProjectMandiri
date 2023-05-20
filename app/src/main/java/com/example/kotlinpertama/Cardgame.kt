package com.example.kotlinpertama

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Cardgame : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cardgame)

        val acakkartu: Button = findViewById(R.id.tombolacakkartu)
        acakkartu.setOnClickListener {
            val kartuImage: ImageView = findViewById(R.id.imageViewkartu)
            val number = Random.nextInt(1, 13)
            val randomOption = getRandomOption()
            val modifiedNumber = when (number) {
                1 -> "a"
                11 -> "j"
                12 -> "q"
                13 -> "k"
                else -> number.toString() // Angka lainnya tetap menggunakan angka aslinya
            }


            val imageName = "_$modifiedNumber${randomOption}"
            val gambardadu = resources.getIdentifier(imageName, "drawable", packageName)
            kartuImage.setImageResource(gambardadu)

            println(randomOption)
            println(number)
            println(gambardadu)



        }

    }

    fun getRandomOption(): String {
        val options = arrayOf("h", "d", "c", "s")
        val randomIndex = Random.nextInt(options.size)
        return options[randomIndex]
    }
}