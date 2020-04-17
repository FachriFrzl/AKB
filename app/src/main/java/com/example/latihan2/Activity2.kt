package com.example.latihan2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity2 : AppCompatActivity() {
    private lateinit var btn2: Button
    private lateinit var btn3 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity2)
        btn2 = findViewById(R.id.button3)
        btn2.setOnClickListener {
            startActivity(Intent(this, Activity3::class.java))
        }
        btn3 = findViewById(R.id.button2)
        btn3.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}