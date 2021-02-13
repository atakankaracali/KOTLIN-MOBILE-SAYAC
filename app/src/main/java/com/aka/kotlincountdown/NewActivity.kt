package com.aka.kotlincountdown

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_new.*

class NewActivity : AppCompatActivity() {
    var number= 0
    var runnable : Runnable = Runnable {  }
    var handler : Handler = Handler(Looper.getMainLooper())


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
    }
    fun start (view: View){
        number = 0
        runnable = object  : Runnable {
            override fun run() {
                number = number +1
                textView2.text = "Time: $number"
                handler.postDelayed(this,1000)
            }


        }
        handler.post(runnable)


    }
    fun stop (view: View){
        handler.removeCallbacks(runnable)


    }
    fun trya (view: View){
        handler.removeCallbacks(runnable)
        number = 0
        textView2.text = "Time:0"

    }

}