package com.example.introductionapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class ActivityA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        Log.v("LIFECYCLE", "onCreate")
    }

    override fun onDestroy() {
        Log.v("LIFECYCLE", "onDestroy")
        super.onDestroy()
    }

    override fun onStart() {
        super.onStart()
        Log.v("LIFECYCLE", "onStart")
    }

    override fun onStop() {
        Log.v("LIFECYCLE", "onStop")
        super.onStop()

    }

    override fun onPause() {
        super.onPause()
        Log.v("LIFECYCLE", "onPause")
    }

    override fun onResume() {
        super.onResume()
        Log.v("LIFECYCLE", "onPause")
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.v("LIFECYCLE", "onAttachedToWindow")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.v("LIFECYCLE", "onDetachedFromWindow")
    }
}