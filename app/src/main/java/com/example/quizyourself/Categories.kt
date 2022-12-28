package com.example.quizyourself

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.card.MaterialCardView

class Categories : AppCompatActivity() {
    lateinit var cvFlags:MaterialCardView
    lateinit var cvWorld:MaterialCardView
    lateinit var cvFamous:MaterialCardView
    lateinit var cvTech:MaterialCardView
    lateinit var cvDisneyPixar:MaterialCardView
    lateinit var username:String
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Now in","Categories onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)
        username = intent.getStringExtra(Constants.USERNAME).toString()

        cvFlags=findViewById(R.id.cv_flags)
        cvWorld=findViewById(R.id.cv_world)
        cvFamous=findViewById(R.id.cv_famous)

        cvDisneyPixar=findViewById(R.id.cv_disneyPixar)
        cvFlags.setOnClickListener{

            ToNextActivity("flags")
        }
        cvFamous.setOnClickListener{

            ToNextActivity("famous people")
        }
        cvDisneyPixar.setOnClickListener{

            ToNextActivity("disney")
        }
        cvWorld.setOnClickListener{

            ToNextActivity("world")
        }
    }
    fun ToNextActivity(category:String){
        val intent=Intent(this,QuizQuestionsActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        intent.putExtra("category",category)
        intent.putExtra(Constants.USERNAME,username)

        startActivity(intent)
        finish()
    }



}