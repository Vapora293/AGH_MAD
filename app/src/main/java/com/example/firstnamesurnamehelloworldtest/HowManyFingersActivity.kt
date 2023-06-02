package com.example.firstnamesurnamehelloworldtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class HowManyFingersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_how_many_fingers)
    }

    fun fingersPlay(view: View) {
        var randomNumber = (1..11).random()
        var textFieldNum = Integer.parseInt(findViewById<EditText>(R.id.textField_fingers_input).text.toString())
        var labello = findViewById<EditText>(R.id.label_fingers_result)
        if (randomNumber == textFieldNum) {
            labello.setText("You won")
        }
        else {
            labello.setText("Whatever, value has been $randomNumber")
        }
    }
}