package com.example.assigment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // declaration of the start button which is used to move to the next activity

        val start_button = findViewById<Button>(R.id.start_button)

        start_button.setOnClickListener {
            //Start the explicit intent
            val intent = Intent(this, MainActivity2::class.java)
            //start the activity
            startActivity(intent)

        }
    }
}

// The IIE.2024.[IMAD5112 Module Manual].Unpublished.