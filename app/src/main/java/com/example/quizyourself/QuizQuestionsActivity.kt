package com.example.quizyourself

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(),View.OnClickListener {
    var mUsername:String?=null
    private var mCurrentPosition:Int=1
    private var questionsList:ArrayList<Question>? = null
    private var mSelectedOption:Int = 0
    private var correctOptionCount:Int=0
    lateinit var optionOne :TextView
    lateinit var optionTwo :TextView
    lateinit var optionThree :TextView
    lateinit var optionFour :TextView
    lateinit var progressBar:ProgressBar
    lateinit var tvProgressBar:TextView
    lateinit var tvQuestion:TextView
    lateinit var image:ImageView
    lateinit var btnSubmit:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        mUsername=intent.getStringExtra(Constants.USERNAME)
        questionsList=Constants.getQuestions()

        optionOne =findViewById(R.id.option_one)
        optionTwo =findViewById(R.id.option_two)
        optionThree =findViewById(R.id.option_three)
        optionFour =findViewById(R.id.option_four)
        progressBar=findViewById(R.id.progressBar)
        tvProgressBar=findViewById(R.id.tvProgress)
        tvQuestion =findViewById(R.id.tvQuestion)
        image=findViewById(R.id.iv_img)
        btnSubmit=findViewById(R.id.button_submit)
        setQuestion()
        optionOne.setOnClickListener(this)
        optionTwo.setOnClickListener(this)
        optionThree.setOnClickListener(this)
        optionFour.setOnClickListener(this)
        btnSubmit.setOnClickListener(this)
    }
    fun setQuestion(){
        val question=questionsList!!.get(mCurrentPosition-1)
        defaultOptionsView()
        if (mCurrentPosition == questionsList?.size){
            btnSubmit.text = "FINISH"
        }else{
            btnSubmit.text="SUBMIT"
        }
        progressBar.progress=mCurrentPosition
        tvProgressBar.text="$mCurrentPosition/${progressBar.max}"
        tvQuestion.text=question!!.text
        optionOne.text=question!!.optionOne
        optionTwo.text=question!!.optionTwo
        optionThree.text=question!!.optionThree
        optionFour.text=question!!.optionFour
        image.setImageResource(question.image)

    }
    fun defaultOptionsView(){
        val options=ArrayList<TextView>()
        options.add(0,optionOne)
        options.add(0,optionTwo)
        options.add(0,optionThree)
        options.add(0,optionFour)
        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface= Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(view: View) {
      when(view.id){
          R.id.option_one->{
              selectedOptionView(optionOne,1)
          }
          R.id.option_two->{
              selectedOptionView(optionTwo,2)
          }
          R.id.option_three->{
              selectedOptionView(optionThree,3)
          }
          R.id.option_four->{
              selectedOptionView(optionFour,4)
          }
          R.id.button_submit->{
            if (mSelectedOption ==0){
                mCurrentPosition++
                when{
                    mCurrentPosition <= questionsList!!.size ->{
                        setQuestion()
                    }
                    else -> {
                        val intent=Intent(applicationContext,FinalScreen::class.java)
                        intent.putExtra(Constants.USERNAME,mUsername)
                        intent.putExtra(Constants.CORRECT_ANSWERS,correctOptionCount)
                        intent.putExtra(Constants.TOTAL_QUESTIONS,questionsList!!.size)
                        startActivity(intent)
                    }
                }
            }else{
                val question=questionsList?.get(mCurrentPosition-1)
                if (question!!.correctOption != mSelectedOption){
                    answerView(mSelectedOption,R.drawable.wrong_option_border_bg)
                }else{
                    correctOptionCount++
                }
                answerView(question.correctOption,R.drawable.correct_option_border_bg)
                if (mCurrentPosition ==questionsList?.size){
                    btnSubmit.text="FINISH"
                }else{
                    btnSubmit.text="NEXT QUESTION"
                }
                mSelectedOption=0
            }
          }

      }
    }
    fun answerView(answer:Int,drawableView:Int){
        when(answer){
            1->{
                optionOne.background=ContextCompat.getDrawable(this,drawableView)
            }
            2->{
                optionTwo.background=ContextCompat.getDrawable(this,drawableView)
            }
            3->{
                optionThree.background=ContextCompat.getDrawable(this,drawableView)
            }
            4->{
                optionFour.background=ContextCompat.getDrawable(this,drawableView)
            }
        }
    }
    fun selectedOptionView(tv:TextView,selectedOptionNumber:Int){
        defaultOptionsView()
        mSelectedOption=selectedOptionNumber
        tv.setTextColor(Color.parseColor("#363a43"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(this,R.drawable.selected_option_border_bg)

    }
}