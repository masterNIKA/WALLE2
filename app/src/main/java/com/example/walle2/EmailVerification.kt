package com.example.walle2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class EmailVerification : AppCompatActivity() {

    private lateinit var sendButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_verification)
        init()
        emailVerificationListeners()
    }

    private fun init(){
        sendButton = findViewById(R.id.Fg_Pass_Email_Send_Button)
    }

    private fun emailVerificationListeners(){
        sendButton.setOnClickListener {
            startActivity(Intent(this,NewPassword::class.java))
        }
    }
}