package com.example.firstnamesurnamehelloworldtest

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun runTextActionsActivity(view: View) {
        var intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun navigateToManyFingers(view: View) {
        startActivity(Intent(this, HowManyFingersActivity::class.java))
    }

    fun navigateToBMI(view: View) {
        startActivity(Intent(this, BMIActivity::class.java))
    }

    fun navigateLists(view: View) {
        startActivity(Intent(this, ListActivity::class.java))
    }

    fun runActivityAndPassValue(view: View) {
        var intent = Intent(this, GetValueActivity::class.java)
        var textfield = findViewById<EditText>(R.id.user_value_to_be_passed)
        intent.putExtra("valueToBePassed", textfield.text.toString())
        startActivity(intent)
    }
    fun spReadFrom(view: View) {
        val sp = getPreferences(Context.MODE_PRIVATE)
        var textfield = findViewById<EditText>(R.id.sp_value)
        textfield.setText(sp.getString("etext", ""))
    }
    fun spWriteTo(view: View) {
        val sp = getPreferences(Context.MODE_PRIVATE)
        val editor = sp.edit()
        var textfield = findViewById<EditText>(R.id.sp_value)
        editor.putString("etext", textfield.text.toString())
        editor.apply()
    }
}