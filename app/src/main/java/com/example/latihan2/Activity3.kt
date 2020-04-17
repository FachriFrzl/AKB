package com.example.latihan2

import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity3 : AppCompatActivity()
{
    private lateinit var btn4 : Button
    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity3)
        btn4 = findViewById(R.id.button4)
        btn4.setOnClickListener {
            startActivity(Intent(this,Activity4::class.java))
        }
    }
}