package com.example.hci_project_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_a.setOnClickListener{

            val intent = Intent(this,SubActivity::class.java)//다음 화면으로이동하기 위한 인텐트
            //두번째에는 이동할 엑티비티
            startActivity(intent)

        }



    }
}
