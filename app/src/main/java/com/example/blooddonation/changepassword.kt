package com.example.blooddonation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class changepassword : AppCompatActivity() {
    lateinit var oldPassword: EditText
    lateinit var newPassword: EditText
    lateinit var confirmPassword: EditText
    lateinit var message: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_changepassword)
        oldPassword = findViewById(R.id.oldpassword)
        newPassword = findViewById(R.id.newPassword)
        confirmPassword = findViewById(R.id.confirmPassword)
        val message = findViewById<Button>(R.id.confirm)
        message.setOnClickListener {
            val oldpass = oldPassword.text.toString()
            val newpass = newPassword.text.toString()
            val confirmpass = confirmPassword.text.toString()
            if (oldpass.isEmpty() || newpass.isEmpty() || confirmpass.isEmpty()) {
                Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            else {
                if (newpass != confirmpass) {
                    Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }else {
                    Toast.makeText(this, "Password changed", Toast.LENGTH_SHORT).show()
                }
            }


        }

    }
}