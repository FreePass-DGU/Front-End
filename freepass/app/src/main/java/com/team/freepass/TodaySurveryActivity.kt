package com.team.freepass

import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TodaySurveryActivity : AppCompatActivity() {

    var food_korean : Button? = null
    var food_japanese : Button? = null
    var food_chinese : Button? = null
    var food_western : Button? = null

    var cafe_mood1 : Button? =  null
    var cafe_mood2 : Button? = null

    var course_1 : Button? = null
    var course_2 : Button? = null
    var course_3 : Button? = null
    var course_4 : Button? = null
    var course_5 : Button? = null
    var course_6 : Button? = null

    var button_complete : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_today_survery)

        var food = arrayOf(0,0,0,0)
        food_korean = findViewById(R.id.food_korean) as Button
        food_japanese = findViewById(R.id.food_japanise) as Button
        food_chinese = findViewById(R.id.food_chinese) as Button
        food_western = findViewById(R.id.food_western) as Button
        food_korean!!.setOnClickListener {
            if(food[0]==0) {
                food_korean!!.setBackgroundResource(R.drawable.button_shape_2)
                food_korean!!.setTextColor(Color.WHITE)
                food[0]=1
            }
            else {
                food_korean!!.setBackgroundResource(R.drawable.button_shape)
                food_korean!!.setTextColor(Color.parseColor("#707070"))
                food[0]=0
            }
        }
        food_japanese!!.setOnClickListener {
            if(food[1]==0) {
                food_japanese!!.setBackgroundResource(R.drawable.button_shape_2)
                food_japanese!!.setTextColor(Color.WHITE)
                food[1]=1
            }
            else {
                food_japanese!!.setBackgroundResource(R.drawable.button_shape)
                food_japanese!!.setTextColor(Color.parseColor("#707070"))
                food[1]=0
            }
        }
        food_chinese!!.setOnClickListener {
            if(food[2]==0) {
                food_chinese!!.setBackgroundResource(R.drawable.button_shape_2)
                food_chinese!!.setTextColor(Color.WHITE)
                food[2]=1
            }
            else {
                food_chinese!!.setBackgroundResource(R.drawable.button_shape)
                food_chinese!!.setTextColor(Color.parseColor("#707070"))
                food[2]=0
            }
        }
        food_western!!.setOnClickListener {
            if(food[3]==0) {
                food_western!!.setBackgroundResource(R.drawable.button_shape_2)
                food_western!!.setTextColor(Color.WHITE)
                food[3]=1
            }
            else {
                food_western!!.setBackgroundResource(R.drawable.button_shape)
                food_western!!.setTextColor(Color.parseColor("#707070"))
                food[3]=0
            }
        }


        var cafe = arrayOf(0,0)
        cafe_mood1 = findViewById(R.id.cafe_mood1) as Button
        cafe_mood2 = findViewById(R.id.cafe_mood2) as Button
        cafe_mood1!!.setOnClickListener {
            if(cafe[0]==0) {
                cafe_mood1!!.setBackgroundResource(R.drawable.button_shape_2)
                cafe_mood1!!.setTextColor(Color.WHITE)
                cafe[0]=1
            }
            else {
                cafe_mood1!!.setBackgroundResource(R.drawable.button_shape)
                cafe_mood1!!.setTextColor(Color.parseColor("#707070"))
                cafe[0]=0
            }
        }
        cafe_mood2!!.setOnClickListener {
            if(cafe[1]==0) {
                cafe_mood2!!.setBackgroundResource(R.drawable.button_shape_2)
                cafe_mood2!!.setTextColor(Color.WHITE)
                cafe[1]=1
            }
            else {
                cafe_mood2!!.setBackgroundResource(R.drawable.button_shape)
                cafe_mood2!!.setTextColor(Color.parseColor("#707070"))
                cafe[1]=0
            }
        }


        var course = arrayOf(0,0,0,0,0,0)
        course_1 = findViewById(R.id.course_1) as Button
        course_2 = findViewById(R.id.course_2) as Button
        course_3 = findViewById(R.id.course_3) as Button
        course_4 = findViewById(R.id.course_4) as Button
        course_5 = findViewById(R.id.course_5) as Button
        course_6 = findViewById(R.id.course_6) as Button
        course_1!!.setOnClickListener {
            if(course[0]==0) {
                course_1!!.setBackgroundResource(R.drawable.button_shape_2)
                course_1!!.setTextColor(Color.WHITE)
                course[0]=1
            }
            else {
                course_1!!.setBackgroundResource(R.drawable.button_shape)
                course_1!!.setTextColor(Color.parseColor("#707070"))
                course[0]=0
            }
        }
        course_2!!.setOnClickListener {
            if(course[1]==0) {
                course_2!!.setBackgroundResource(R.drawable.button_shape_2)
                course_2!!.setTextColor(Color.WHITE)
                course[1]=1
            }
            else {
                course_2!!.setBackgroundResource(R.drawable.button_shape)
                course_2!!.setTextColor(Color.parseColor("#707070"))
                course[1]=0
            }
        }
        course_3!!.setOnClickListener {
            if(course[2]==0) {
                course_3!!.setBackgroundResource(R.drawable.button_shape_2)
                course_3!!.setTextColor(Color.WHITE)
                course[2]=1
            }
            else {
                course_3!!.setBackgroundResource(R.drawable.button_shape)
                course_3!!.setTextColor(Color.parseColor("#707070"))
                course[2]=0
            }
        }
        course_4!!.setOnClickListener {
            if(course[3]==0) {
                course_4!!.setBackgroundResource(R.drawable.button_shape_2)
                course_4!!.setTextColor(Color.WHITE)
                course[3]=1
            }
            else {
                course_4!!.setBackgroundResource(R.drawable.button_shape)
                course_4!!.setTextColor(Color.parseColor("#707070"))
                course[3]=0
            }
        }
        course_5!!.setOnClickListener {
            if(course[4]==0) {
                course_5!!.setBackgroundResource(R.drawable.button_shape_2)
                course_5!!.setTextColor(Color.WHITE)
                course[4]=1
            }
            else {
                course_5!!.setBackgroundResource(R.drawable.button_shape)
                course_5!!.setTextColor(Color.parseColor("#707070"))
                course[4]=0
            }
        }
        course_6!!.setOnClickListener {
            if(course[5]==0) {
                course_6!!.setBackgroundResource(R.drawable.button_shape_2)
                course_6!!.setTextColor(Color.WHITE)
                course[5]=1
            }
            else {
                course_6!!.setBackgroundResource(R.drawable.button_shape)
                course_6!!.setTextColor(Color.parseColor("#707070"))
                course[5]=0
            }
        }

        button_complete = findViewById(R.id.button_complete) as Button
        button_complete!!.setOnClickListener{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}
