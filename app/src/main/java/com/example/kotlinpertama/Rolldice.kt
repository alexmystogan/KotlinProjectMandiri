package com.example.kotlinpertama

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class Rolldice : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rolldice)
        var player1 = null
        var player2 = null
        var scoreplayer1 = 0
        var scoreplayer2 = 0
        var akumulasiscoreP1 =0
        var akumulasiscoreP2 =0
        val Playertextview = findViewById<TextView>(R.id.Playertextview)
        val Playertextviewscore1 = findViewById<TextView>(R.id.textViewScoreplayer1)
        val PlayertextviewAKscore1 = findViewById<TextView>(R.id.textViewAkumulasi1)
        val Playertextviewscore2 = findViewById<TextView>(R.id.textViewScoreplayer2)
        val PlayertextviewAKscore2 = findViewById<TextView>(R.id.textViewAkumulasi12)
        val random = Random(System.currentTimeMillis())
        var giliranpertamaP1 = random.nextBoolean()

        var banyakputaran1 = 3
        var banyakputaran2 = 3

        if (giliranpertamaP1) {
            var player1 = true
            var player2 = false
            Playertextview.text = "Giliran Player 1"
        } else {
            var player1 = true
            var player2 = false
            Playertextview.text = "Giliran Player 1"
        }


        val acakdadu: Button = findViewById(R.id.buttonAcak)
        acakdadu.setOnClickListener {
            if(banyakputaran1>0){

                if (banyakputaran1>0) {
                    val diceImage: ImageView = findViewById(R.id.imageView2)
                    val number = Random.nextInt(1, 6)
                    println("ini isi Number random $number")

                    val numberscore = number
                    number.toString()
                    println("------------")
                    println("ini isi Numberscore $numberscore")
                    scoreplayer1 = numberscore

                    val gambardadu =
                        resources.getIdentifier("dice_$number", "drawable", packageName)
                    diceImage.setImageResource(gambardadu)
                    akumulasiscoreP1 += numberscore
                    Playertextview.text = "Giliran Player Alex "
                    Playertextviewscore1.text = "Score : $scoreplayer1"
                    PlayertextviewAKscore1.text = "AK : $akumulasiscoreP1"

                    println("ini isi Akumulasiscore playerSatu $akumulasiscoreP1")

                    --banyakputaran1

                }
                else{
                    giliranpertamaP1=false
                }


                }
            else {
                    if (banyakputaran2>0) {
                        val diceImage: ImageView = findViewById(R.id.imageView2)
                        val number = Random.nextInt(1, 6)
                        println("ini isi Number random $number")

                        val numberscore2 = number
                        number.toString()
                        println("------------")
                        println("ini isi Numberscore $numberscore2")
                        scoreplayer2 = numberscore2

                        val gambardadu =
                            resources.getIdentifier("dice_$number", "drawable", packageName)
                        diceImage.setImageResource(gambardadu)
                        akumulasiscoreP2 += numberscore2
                        Playertextview.text = "Giliran Player Mystogan "
                        Playertextviewscore2.text = "Score : $scoreplayer2"
                        PlayertextviewAKscore2.text = "AK : $akumulasiscoreP2"

                        println("ini isi Akumulasiscore playerSatu $akumulasiscoreP2")

                        --banyakputaran2



                }
                if (banyakputaran2==0){
                    giliranpertamaP1=true
                }


            }
            if(banyakputaran1==0&&banyakputaran2==0){
                println("permainan Selesai")
                println("ini score player 1 $scoreplayer1")
                println("ini score player 1 $scoreplayer2")
                if (akumulasiscoreP1>akumulasiscoreP2){
                    println("Player 1 Menang")
                }
                else if (akumulasiscoreP1<akumulasiscoreP2){
                    println("Player 1 Menang")
                }
                else {
                    println("Hasil Imbang")
                }

        }
            //tombol belum di edit
//            val buttonNext = findViewById<Button>(R.id.buttonNext)
//            buttonNext.setOnClickListener{
//                val intent = Intent(this, Cardgame::class.java)
//                startActivity(intent)
//            }
    }
}
}























