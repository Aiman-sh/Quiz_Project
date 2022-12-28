package com.example.quizyourself

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.window.SplashScreen

class FirstScreen : AppCompatActivity() {
    lateinit var topAnimation :Animation
    lateinit var bottomAnimation :Animation
    lateinit var title:TextView
    lateinit var subText:TextView
    lateinit var image:ImageView
    val splashScreen: Long = 3000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        topAnimation = AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomAnimation = AnimationUtils.loadAnimation(this,R.anim.bottom_animation)

        title=findViewById(R.id.tv_title)
        subText=findViewById(R.id.tvSubtext)
        image = findViewById(R.id.iv_firstScreen)

        image.animation=topAnimation
        title.animation=bottomAnimation
        subText.animation=bottomAnimation
        Handler(Looper.getMainLooper()).postDelayed({
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
            finish()
        }, splashScreen)


    }




}