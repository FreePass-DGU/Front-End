package com.team.freepass

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CourseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_course)

        var img1: ImageView = findViewById(R.id.img1)
        img1.setOnClickListener{
            var intent = Intent(this, TodaySurveryActivity::class.java)
            startActivity(intent)

        }
        var img2:ImageView = findViewById(R.id.img2)
        img2.setOnClickListener{

        }
        var textfreepass: TextView = findViewById(R.id.textfreepass)
        textfreepass.setText("프리패스")
        textfreepass.setOnClickListener{

        }

        var button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            val intent = Intent(this, CourseDetailActivity::class.java)
            startActivity(intent)
        }
        var button2:Button = findViewById(R.id.button2)
        button2.setOnClickListener {
            val intent=Intent(this, CourseDetailActivity::class.java)
            startActivity(intent)
        }
        var button3:Button = findViewById(R.id.button3)
        button3.setOnClickListener {
            val intent=Intent(this, CourseDetailActivity::class.java)
            startActivity(intent)
        }

    }
}