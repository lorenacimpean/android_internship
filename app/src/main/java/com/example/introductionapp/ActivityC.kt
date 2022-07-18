package com.example.introductionapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.introductionapp.databinding.ActivityCBinding
import com.google.android.material.snackbar.Snackbar


class ActivityC : AppCompatActivity() {

    private lateinit var binding: ActivityCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        var stringParamFromParent = intent.getStringExtra("stringParam")
        var intParamFromParent = intent.getIntExtra("intParam", 1)

        binding.button4.setOnClickListener { view ->
            val data = Intent()
            stringParamFromParent += " Kotlin"
            intParamFromParent += 3
            data.putExtra("stringParam", stringParamFromParent)
            data.putExtra("intParam", intParamFromParent)
            setResult(RESULT_OK, data)
            finish()
        }
        binding.button5.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
            val data = Intent()
            data.putExtra("stringParam", "CANCELLED")
            data.putExtra("intParam", -1)
            setResult(RESULT_CANCELED, data)
            finish()
        }
    }


}