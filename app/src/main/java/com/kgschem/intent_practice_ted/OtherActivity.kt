package com.kgschem.intent_practice_ted

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)


        returntomainbtn.setOnClickListener {


//            val myintent = Intent(this, MainActivity::class.java)
////            startActivity(myintent)

            finish()

        }
    }
}