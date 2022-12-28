package com.example.quizyourself

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FinalScreen : AppCompatActivity() {
    lateinit var btnFinish:Button
    lateinit var tvResult:TextView
    lateinit var tvUsername:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_screen)
        btnFinish=findViewById(R.id.btn_finish)
        tvResult=findViewById(R.id.tv_score)
        val username=intent.getStringExtra(Constants.USERNAME)
        tvUsername=findViewById(R.id.tv_username)
        tvUsername.text = username
        val score=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        tvResult.text="Your score is $score out of $totalQuestions"
        btnFinish.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}