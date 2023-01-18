package com.example.walle2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PaymentPage : AppCompatActivity() {

    private lateinit var goToMainPage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_page)
        init()
        paymentListeners()
    }

    private fun init(){
        goToMainPage = findViewById(R.id.Payment_Page_Go_To_Main_Page)
    }

    private fun paymentListeners(){
        goToMainPage.setOnClickListener {
            startActivity(Intent(this, MainPage::class.java))
        }
    }
}