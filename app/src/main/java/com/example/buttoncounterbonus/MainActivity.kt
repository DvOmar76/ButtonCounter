package com.example.buttoncounterbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
           var count =textView.text.toString().toInt()
            count+=1
            textView.text=count.toString()
        }
        btnDelete.setOnClickListener {
            var count =textView.text.toString().toInt()
            count-=1
            textView.text=count.toString()

        }
    }
}