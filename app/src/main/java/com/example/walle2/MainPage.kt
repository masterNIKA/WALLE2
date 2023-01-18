package com.example.walle2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainPage : AppCompatActivity() {

    private lateinit var addCard: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_page)
        init()
        mainPageListeners()
    }

    private fun init(){
        addCard = findViewById(R.id.Main_Page_Add_Card)
    }

    private fun mainPageListeners(){
        addCard.setOnClickListener {
            startActivity(Intent(this,Addcard::class.java))
        }
    }
}