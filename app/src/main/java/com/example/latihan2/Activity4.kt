package com.example.latihan2

import android.content.Intent
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Activity4 : AppCompatActivity() {
    private lateinit var btn5 : Button
    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity4)
        btn5 = findViewById(R.id.button5)
        btn5.setOnClickListener {
            startActivity(Intent(this,Activity5::class.java))
        }
    }
}