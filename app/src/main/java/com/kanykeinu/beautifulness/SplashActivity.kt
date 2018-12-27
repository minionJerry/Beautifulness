package com.kanykeinu.beautifulness

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : Activity() {
    private val mWaitHandler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        mWaitHandler.postDelayed(Runnable {startActivity(Intent(this,MainActivity::class.java))
                                            finish()}, 2000)
    }

    override fun onDestroy() {
        mWaitHandler.removeCallbacksAndMessages(null)
        super.onDestroy()
    }
}
