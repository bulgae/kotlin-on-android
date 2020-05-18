package com.example.bulgae.mydiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        var countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener{ countUp() }

    }

    // Roll dice on button click
    private fun rollDice() {
        // Update text into "Dice Rolled!"
        var resultText: TextView =findViewById(R.id.result_text)
        //resultText.text = "Dice Rolled!"

        // Display random number
        val randomInt = (1..6).random()
        resultText.text = randomInt.toString()

        // Display "button clicked" text
        //Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        // if the text is "Hello World" set the text to 1.
        if (resultText.text == "Hello World!") {
            resultText.text = "1"
        } else{
            // Otherwise, increase the number up to 6
            var resultInt = resultText.text.toString().toInt()

            if(resultInt < 6){
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }

}
