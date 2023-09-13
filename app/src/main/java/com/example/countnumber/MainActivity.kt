package com.example.countnumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNumber = findViewById<TextView>(R.id.tv_numberView)
        val btnReset = findViewById<Button>(R.id.btn_reset)
        val btnPlus = findViewById<Button>(R.id.btn_plus)

        var number = 0

        btnReset.setOnClickListener {
            number = 0
            tvNumber.text = number.toString()
            Log.d("onClick", "리셋 된 숫자는 $number")
        }

        btnPlus.setOnClickListener {
            number += 1
            tvNumber.text = number.toString()
            Log.d("onClick", "플러스 된 숫자는 $number")
        }
    }
}