package com.example.blooddonation

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class registration : AppCompatActivity() {
    lateinit var usernameInput: EditText
    lateinit var emailidInput: EditText
    lateinit var passwordInput: EditText
    lateinit var phonenumberInput: EditText
    lateinit var confirmpasswordInput: EditText
    lateinit var addressInput: EditText
    lateinit var bloodgroupInput: EditText
    lateinit var registrationBtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_registration)

        usernameInput = findViewById(R.id.username)
        emailidInput = findViewById(R.id.emailid)
        passwordInput = findViewById(R.id.Password1)
        confirmpasswordInput = findViewById(R.id.Password2)
        phonenumberInput = findViewById(R.id.phonenumber)
        addressInput = findViewById(R.id.address)
        bloodgroupInput = findViewById(R.id.bloodgroup)
        registrationBtn = findViewById(R.id.reg)

        registrationBtn.setOnClickListener {
            val username = usernameInput.text.toString()
            val emailid = emailidInput.text.toString()
            val password = passwordInput.text.toString()
            val confirmpassword = confirmpasswordInput.text.toString()
            val phonenumber = phonenumberInput.text.toString()
            val address = addressInput.text.toString()
            val bloodgroup = bloodgroupInput.text.toString()

            if (username.isEmpty() || emailid.isEmpty() || password.isEmpty() || phonenumber.isEmpty() || address.isEmpty() || bloodgroup.isEmpty() || confirmpassword.isEmpty()) {
                Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            findViewById<Button>(R.id.reg).setOnClickListener {
                val show = Intent(this, login::class.java)
                startActivity(show)
            }
        }
    }
}