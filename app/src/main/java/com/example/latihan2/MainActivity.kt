package com.example.latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
private lateinit var Btn1 : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Btn1 = findViewById(R.id.button5)
        Btn1.setOnClickListener {
            startActivity(Intent(this,Activity2::class.java))
            // Nama         : Muhamad Fachrizal
            // Kelas        : IF-5
            // Nim          : 10117174
            // Dikerjakan   : 17/04/2020
        }

    }
}
