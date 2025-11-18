package com.example.blooddonation

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile)
        val imgProfile = findViewById<ImageView>(R.id.imgProfile)
        val txtUsername = findViewById<TextView>(R.id.txtUsername)
        val txtEmail = findViewById<TextView>(R.id.txtEmail)
        val txtBio = findViewById<TextView>(R.id.txtBio)
        val btnEditProfile = findViewById<Button>(R.id.btnProfile)


        txtUsername.text = "donar name"
        txtEmail.text = "donar@gmail.com"
        txtBio.text = "Addreaa | Blood group | Contact number"


        btnEditProfile.setOnClickListener {
            Toast.makeText(this, "Edit Profile clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}


