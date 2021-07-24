package com.shiva.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var diceOneImg : ImageView
    lateinit var diceTwoImg : ImageView
    lateinit var totalnumber : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceOneImg = findViewById(R.id.diceOne)
        diceTwoImg = findViewById(R.id.diceTwo)
        totalnumber = findViewById(R.id.total)

        val rollButton = findViewById<Button>(R.id.btn_roll_dice)

        rollButton.setOnClickListener {

            rollDice()

        }
    }

    fun rollDice() {

        val randomNumber1 = (1..6).random()
        val randomNumber2 = (1..6).random()
        val totalCaptureResult = randomNumber1 + randomNumber2

        

        val image1 = when(randomNumber1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_empty
        }

        val image2 = when(randomNumber2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_empty
        }

        diceOneImg.setImageResource(image1)
        diceTwoImg.setImageResource(image2)
        //totalnumber.setText(totalCaptureResult)
        totalnumber.setText(String.format("%d",totalCaptureResult))

    }
}