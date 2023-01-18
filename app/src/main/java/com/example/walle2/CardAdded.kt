package com.example.walle2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class CardAdded : AppCompatActivity() {

    private lateinit var addAnotherCard: TextView
    private lateinit var goToMainPage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card_added)
        init()
        addCardListeners()
    }

    private fun init(){
        addAnotherCard = findViewById(R.id.Card_Added_Add_Another)
        goToMainPage = findViewById(R.id.Card_Added_Go_To_Main_Page)
    }

    private fun addCardListeners() {
        addAnotherCard.setOnClickListener {
            startActivity(Intent(this,Addcard::class.java ))
            finish()
        }

        goToMainPage.setOnClickListener {
            startActivity(Intent(this, MainPage::class.java))
            finish()
        }
    }
}