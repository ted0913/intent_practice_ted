package com.kgschem.intent_practice_ted

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class messageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        //이 화면에 들어올때 첨부된 데이터를 텍스트뷰에 반영

        val intentmessage = intent.getStringExtra("message")

        recei
        receivedMessageTxt.text = intentmessage

    }
}