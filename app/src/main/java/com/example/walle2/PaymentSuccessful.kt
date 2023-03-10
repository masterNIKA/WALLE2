package com.example.walle2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PaymentSuccessful : AppCompatActivity() {

    private lateinit var goToMainPage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_successful)
        init()
        paymentSuccessfulListeners()
    }

    private fun init(){

        goToMainPage = findViewById(R.id.Pay_Success_Go_To_Main_Page)
    }

    private fun paymentSuccessfulListeners(){

        goToMainPage.setOnClickListener {
            startActivity(Intent(this,MainPage::class.java))
        }
    }
}