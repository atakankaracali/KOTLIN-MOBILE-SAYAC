package com.aka.kotlincountdown

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun go (view: View){
        object : CountDownTimer(119000,1000){
            override fun onTick(millisUntilFinished: Long) {
                textView.text = "Left: ${millisUntilFinished/1000}"

            }

            override fun onFinish() {
                textView.text = "Left: 0"
                val intent = Intent(applicationContext, NewActivity::class.java)
                startActivity(intent)
                finish()

            }

        }.start()


    }

}