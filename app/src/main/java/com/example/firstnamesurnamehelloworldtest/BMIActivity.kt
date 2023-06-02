package com.example.firstnamesurnamehelloworldtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView

class BMIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmiactivity)
    }

    fun BMIcalculate(view: View) {
        var weight = findViewById<EditText>(R.id.input_weight).text.toString().toDouble()
        var height = findViewById<EditText>(R.id.input_height).text.toString().toDouble()
        var bmi = weight / Math.pow(height, 2.0)
        val myImageView = findViewById<ImageView>(R.id.myImageView)
        if (bmi < 18.5) {
            myImageView.setImageResource(R.drawable.underweight)
        }
        else if (bmi < 25) {
            myImageView.setImageResource(R.drawable.healthy)
        }
        else if (bmi < 30) {
            myImageView.setImageResource(R.drawable.overweight)
        }
        else {
            myImageView.setImageResource(R.drawable.obesity)
        }
    }
}