package com.example.kotlinstudy

import android.graphics.Color.BLUE
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tvHelloWorld = findViewById<TextView>(R.id.tv_hello_world)
        tvHelloWorld.setTextColor(BLUE)
    }
}
