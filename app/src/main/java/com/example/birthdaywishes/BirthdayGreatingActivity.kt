package com.example.birthdaywishes

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BirthdayGreatingActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA ="ans"
    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_birthday_greating)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val ans = intent.getStringExtra("ans")
        val birthdaygreating = findViewById<TextView>(R.id.birthdayGreating)
        birthdaygreating.text = ("Happiest Birthday \n       $ans!!")
    }
}