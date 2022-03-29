package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mainScreen = findViewById<TextView>(R.id.mainScreen)
        var btn0 = findViewById<Button>(R.id.btn0)
        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)
        var btn5 = findViewById<Button>(R.id.btn5)
        var btn6 = findViewById<Button>(R.id.btn6)
        var btn7 = findViewById<Button>(R.id.btn7)
        var btn8 = findViewById<Button>(R.id.btn8)
        var btn9 = findViewById<Button>(R.id.btn9)
        var btnMinus = findViewById<Button>(R.id.btnMinus)
        var btnMultiply = findViewById<Button>(R.id.btnMultiply)
        var btnDivide = findViewById<Button>(R.id.btnDivide)
        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var btnAC = findViewById<Button>(R.id.btnAC)
        var btnPercentage = findViewById<Button>(R.id.btnPercentage)
        var btnEqual = findViewById<Button>(R.id.btnEqual)

    }
}