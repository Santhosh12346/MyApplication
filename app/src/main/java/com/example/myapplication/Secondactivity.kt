package com.example.myapplication

import android.content.Intent
import android.net.wifi.hotspot2.pps.HomeSp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class Secondactivity : AppCompatActivity() {
    lateinit var tvHome: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        var intentStarted = intent;
        var extras = intentStarted.extras
        var data = extras?.getString("harmankey")
        tvHome = findViewById(R.id.tvHome)
        tvHome.text = data
    }
    fun clickHandler(view: View) {
        var hIntent = Intent(this, MainActivity::class.java)
        startActivity(hIntent)
    }
}