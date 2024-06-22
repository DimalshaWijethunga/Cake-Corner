package com.example.cake_corner

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val navi1 = findViewById<ImageView>(R.id.navi1)
        navi1.setOnClickListener {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }

        val navi3 = findViewById<ImageView>(R.id.navi3)
        navi3.setOnClickListener {
            val intent = Intent(this, customized::class.java)
            startActivity(intent)
        }

        val nvg = findViewById<ImageView>(R.id.nvg)
        nvg.setOnClickListener {
            val intent = Intent(this, cartN::class.java)
            startActivity(intent)
        }

    }
}