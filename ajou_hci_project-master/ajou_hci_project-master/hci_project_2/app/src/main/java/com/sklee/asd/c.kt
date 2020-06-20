package com.sklee.asd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_c.*

class c : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        but_a_a_a.setOnClickListener {
            val intent = Intent(this@c, Intent1::class.java)
            startActivity(intent)
        }
    }
}