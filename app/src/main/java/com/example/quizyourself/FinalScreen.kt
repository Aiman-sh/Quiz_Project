package com.example.quizyourself

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class FinalScreen : AppCompatActivity() {
    lateinit var btnFinish:Button
    lateinit var btnExit:Button
    lateinit var tvResult:TextView
    lateinit var tvUsername:TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Now in","finaScreen onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_screen)

        btnFinish=findViewById(R.id.btn_finish)
        btnExit=findViewById(R.id.btn_exit)
        tvResult=findViewById(R.id.tv_score)

        val username=intent.getStringExtra(Constants.USERNAME)
        tvUsername=findViewById(R.id.tv_username)
        tvUsername.text = username+ ", you did good."
        val score=intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        tvResult.text="Your score is $score out of $totalQuestions"

        btnFinish.setOnClickListener{
            val intent:Intent=Intent(this,Categories::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            intent.putExtra(Constants.USERNAME,username)
            startActivity(intent)
            finish()
        }
        btnExit.setOnClickListener {
            finish()
        }

    }
}