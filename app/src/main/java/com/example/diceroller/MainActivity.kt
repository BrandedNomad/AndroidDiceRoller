package com.example.diceroller

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll!"

        rollButton.setOnClickListener{
            rollDice()
        }


    }

    private fun rollDice(){
        val resultImage: ImageView = findViewById(R.id.result_image)

        val randomNumber:Double = Math.floor(Math.random() * 7)
        val drawableResource = when (randomNumber.toInt()){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        resultImage.setImageResource(drawableResource)
    }
}