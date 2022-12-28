package com.example.quizyourself

data class Questions(
    val id:Int,
    val text:String,
    val image:Int,
    val optionOne:String,
    val optionTwo:String,
    val optionThree:String,
    val optionFour:String,
    val correctOption:Int
    )