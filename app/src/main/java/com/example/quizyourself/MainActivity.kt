package com.example.quizyourself

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var nameEditText:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        val startButton:Button=findViewById(R.id.startButton)
        nameEditText=findViewById(R.id.et_name)
        startButton.setOnClickListener {
            if (nameEditText.text.toString().isEmpty()){
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_LONG).show()
            }else{
                val intent:Intent=Intent(this,Categories::class.java) //QuizQuestionsActivity
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                intent.putExtra(Constants.USERNAME,nameEditText.text.toString())

                startActivity(intent)
                finish()
            }
        }
    }

}