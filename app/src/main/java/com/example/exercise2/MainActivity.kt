package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val q3= question3()
        q3.showdetails()

        val q4=question4()
        q4.library()

        val q2=question2()
        q2.ques2()
    }
}