package com.example.blooddonation

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login : AppCompatActivity() {
    lateinit var emailInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        emailInput = findViewById(R.id.email)
        passwordInput = findViewById(R.id.Password)
        loginBtn = findViewById(R.id.btn)

        loginBtn.setOnClickListener {
            val email = emailInput.text.toString()
            val password = passwordInput.text.toString()

            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Email/Password cannot be empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            findViewById<Button>(R.id.btn).setOnClickListener {
                val show = Intent(this, dashboard::class.java)
                startActivity(show)
            }
        }
    }
}