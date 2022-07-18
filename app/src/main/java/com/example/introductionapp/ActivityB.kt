package com.example.introductionapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.introductionapp.databinding.ActivityBBinding


class ActivityB : AppCompatActivity() {

    private lateinit var binding: ActivityBBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityBBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"))

        binding.fab.setOnClickListener { view ->
            startActivity(browserIntent)
        }
    }


}