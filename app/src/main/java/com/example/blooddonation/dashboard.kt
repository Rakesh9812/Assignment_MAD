package com.example.blooddonation

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dashboard)
        findViewById<Button>(R.id.btn1).setOnClickListener {
            val show = Intent(this, profile::class.java)
            startActivity(show)

        }
        findViewById<Button>(R.id.btn2).setOnClickListener {
            val show = Intent(this, donarlist::class.java)
            startActivity(show)

        }

        findViewById<Button>(R.id.btn5).setOnClickListener {
            val show = Intent(this, changepassword::class.java)
            startActivity(show)
        }
        findViewById<Button>(R.id.btn6).setOnClickListener {
            val show = Intent(this, MainActivity::class.java)
            startActivity(show)
        }


    }
}