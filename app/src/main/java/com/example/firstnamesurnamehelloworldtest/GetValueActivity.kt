package com.example.firstnamesurnamehelloworldtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class GetValueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_value)
        var passed_value = findViewById<EditText>(R.id.passed_value)
        passed_value.setText(intent.getStringExtra("valueToBePassed"))
    }
    fun getBack(view: View) {
        finish()
    }
}