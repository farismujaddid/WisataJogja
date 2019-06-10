package com.aclass.wisatajogja

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashScreen : AppCompatActivity() {
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        handler= Handler()
        handler.postDelayed(Runnable {
            var intent:Intent
            intent=Intent(this@SplashScreen,MainActivity::class.java)
            startActivity(intent)
            this@SplashScreen.finish()
        },2000)
    }
}
