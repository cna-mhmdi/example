package com.example.javai

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.Enter_Button)?.setOnClickListener {

            val toastText = findViewById<TextView>(R.id.toast_text)

            val firstName = findViewById<TextInputEditText>(R.id.first_Name)?.text.toString().trim()

            val lastName = findViewById<TextInputEditText>(R.id.last_name)?.text.toString().trim()


            if (firstName.isNotEmpty() && lastName.isNotEmpty()){

                val nameToDisplay = firstName.plus(" ").plus(lastName)
                toastText?.text = " ${getString(R.string.welcome_to_the_app)} $nameToDisplay"
            }
            else
                toastText.text = ""
                Toast.makeText(this,getString(R.string.please_enter_a_name),Toast.LENGTH_SHORT).show()
        }
    }
}