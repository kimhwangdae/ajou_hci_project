package com.example.hci_project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        Bnt_a_a.setOnClickListener{

            val intent_a =Intent(this,ThirdActivity::class.java)

            startActivity(intent_a)
        }
    }
}
