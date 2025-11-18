package com.example.blooddonation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.login1).setOnClickListener {
            val show = Intent(this, login::class.java)
            startActivity(show)
        }


            findViewById<Button>(R.id.sign).setOnClickListener {
                val show = Intent(this, registration::class.java)
                startActivity(show)

            }
    }
}