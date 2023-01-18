package com.example.walle2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CreateAccount : AppCompatActivity() {

    private lateinit var registerButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)
        init()
        createAccountListeners()
    }

    private fun init(){
        registerButton = findViewById(R.id.Create_Account_Register)
    }

    private fun createAccountListeners(){
        registerButton.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}