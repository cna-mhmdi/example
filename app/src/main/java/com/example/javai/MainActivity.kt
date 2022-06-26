package com.example.javai

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.rgb_btn).setOnClickListener {

            val redChannel = findViewById<TextInputEditText>(R.id.red_channel).text.toString()
            val greenChannel = findViewById<TextInputEditText>(R.id.green_channel).text.toString()
            val blueChannel = findViewById<TextInputEditText>(R.id.blue_channel).text.toString()

            if (redChannel.length == 2 && greenChannel.length == 2 && blueChannel.length == 2){

                val rgbCode = redChannel.plus(greenChannel).plus(blueChannel)
                val colorAsInt = Color.parseColor("#".plus(rgbCode))
                findViewById<TextView>(R.id.color_created_display).setBackgroundColor(colorAsInt)

            }else{
                Toast.makeText(this,getString(R.string.please_enter_a_color),Toast.LENGTH_SHORT).show()
            }
        }
    }
}
