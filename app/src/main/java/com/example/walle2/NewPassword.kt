package com.example.walle2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class NewPassword : AppCompatActivity() {

    private lateinit var oldPassword: EditText
    private lateinit var newPassword: EditText
    private lateinit var continueButton: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_password)
        init()
        createNewPasswordListeners()
    }

    private fun init(){
        oldPassword = findViewById(R.id.New_Password_Enter_Your_Password)
        newPassword = findViewById(R.id.New_Password_Create_New_Password)
        continueButton = findViewById(R.id.New_Password_Continue_Button)
    }

    private fun createNewPasswordListeners(){
        continueButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}