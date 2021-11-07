package com.kgschem.intent_practice_ted

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendmessageBtn.setOnClickListener {

            //입력한 내용을 변수에 저장.            
            val inputmessage = messageEdt.text.toString()
            
            //비행기 티켓 발권            
            val myintent = Intent(this, messageActivity::class.java)
            
            //수하물 첨부            
            myintent.putExtra("message", inputmessage)
            
            //실제출발
            startActivity(myintent)

            
        }

        moveToOtherBtn.setOnClickListener {

            //다른화면으로 이동(OtherActivity)

            val MyIntent = Intent(this, OtherActivity::class.java)
            startActivity(MyIntent)

        }
    }
}