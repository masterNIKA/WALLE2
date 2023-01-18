package com.example.walle2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var forgotPassword: TextView
    private lateinit var signUp: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
        loginListeners()
    }

    private fun init(){
        forgotPassword = findViewById(R.id.Log_Pg_Forgot_Password)
        signUp = findViewById(R.id.Log_Pg_Sign_Up)
    }

    private fun loginListeners(){

        forgotPassword.setOnClickListener {
            startActivity(Intent(this, EmailVerification::class.java))
            finish()
        }

        signUp.setOnClickListener {
            startActivity(Intent(this, CreateAccount::class.java))
        }
    }
}