package com.example.firstnamesurnamehelloworldtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actions_layout)
    }

    fun writeToLogcat(view: View) {
        Log.i("MyApp", "Message from the app")
    }

    fun showToastMessage(view: View) {
        Toast.makeText(this, "The message from the second button", Toast.LENGTH_LONG).show()
    }

    fun writeToEditText(view: View) {
        var textField = findViewById<EditText>(R.id.write_to_edit_text)
        var stringer = findViewById<Button>(R.id.write_to_edit_button).text
        textField.setText(stringer)
    }

    fun copyUserValueToEditText(view: View) {
        var firstTextField = findViewById<EditText>(R.id.user_value_write_to_edit_text)
        var secondTextField = findViewById<EditText>(R.id.user_value_edit_text)
        secondTextField.setText(firstTextField.text)
    }
}