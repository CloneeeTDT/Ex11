package com.example.ex11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var toastBtn: Button
    private lateinit var countBtn: Button
    private lateinit var resultDisplay: TextView
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastBtn = findViewById(R.id.toastBtn)
        countBtn = findViewById(R.id.countBtn)
        resultDisplay = findViewById(R.id.resultDisplay)

        toastBtn.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Nguyen Thanh Huy 51800781",
                Toast.LENGTH_SHORT
            ).show()
        }
        countBtn.setOnClickListener {
            count++
            resultDisplay.text = count.toString()
        }
    }
}