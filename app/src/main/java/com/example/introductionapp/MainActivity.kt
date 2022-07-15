package com.example.introductionapp

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts.StartActivityForResult
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private lateinit var resultView: TextView
    private lateinit var stringParamView: TextView
    private lateinit var intParamView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val buttonA: Button = findViewById<View>(R.id.button) as Button

        buttonA.setOnClickListener {
            val activityAIntent = Intent(this, ActivityA::class.java)
            startActivity(activityAIntent)
        }
        val buttonB: Button = findViewById<View>(R.id.button2) as Button

        buttonB.setOnClickListener {
            val activityAIntent = Intent(this, ActivityB::class.java)
            startActivity(activityAIntent)
        }
        val buttonC: Button = findViewById<View>(R.id.button3) as Button

        buttonC.setOnClickListener {
            val intent = Intent(applicationContext, ActivityC::class.java)
            intent.putExtra("stringParam", "Hello")
            intent.putExtra("intParam", 0)
            resultLauncher.launch(intent)
        }
        resultView = findViewById<View>(R.id.resultView) as TextView
        stringParamView = findViewById<View>(R.id.string_from_child) as TextView
        intParamView = findViewById<View>(R.id.int_from_child) as TextView

    }

    var resultLauncher =
        registerForActivityResult(StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {

                val data: Intent? = result.data
                resultView.text = "OK"
                stringParamView.text = data?.getStringExtra("stringParam")
                intParamView.text = data?.getIntExtra("intParam", -9999)?.toString()

            }
            if (result.resultCode == Activity.RESULT_CANCELED) {
                val data: Intent? = result.data
                resultView.text = "Cancelled"
                stringParamView.text = data?.getStringExtra("stringParam")
                intParamView.text = data?.getIntExtra("intParam", -9999)?.toString()

            }
        }


}