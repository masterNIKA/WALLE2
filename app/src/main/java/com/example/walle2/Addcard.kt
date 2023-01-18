package com.example.walle2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Addcard : AppCompatActivity() {

    private lateinit var addButton: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_card)
        init()
    }

    private fun init(){
        addButton = findViewById(R.id.Add_Card_Add_Button)
    }

    private fun addCardListeners() {
        addButton.setOnClickListener {
            startActivity(Intent(this, CardAdded::class.java))
        }
    }
}