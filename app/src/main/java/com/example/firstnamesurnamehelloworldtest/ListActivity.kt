package com.example.firstnamesurnamehelloworldtest

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class ListActivity : AppCompatActivity() {
    private val listOfFlowers = ArrayList<String>()
    private val listOfFlowerImageIDs = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_layout)

        initializeFlowerList()

        var flower_list = findViewById<ListView>(R.id.flower_list)

        var adapter = FlowerNameAdapter(this, listOfFlowers, listOfFlowerImageIDs)
        flower_list.adapter = adapter
        flower_list.setOnItemClickListener { parent, view, position, id ->
            showFlowerNameInputBox(listOfFlowers[position], position, adapter)

        }
    }

    private fun showFlowerNameInputBox(oldName: String, position: Int, adapter: FlowerNameAdapter) {
        val dialog = Dialog(this)
        dialog.setTitle("Modify flower name")
        dialog.setContentView(R.layout.input_box_layout)
        val inputText = dialog.findViewById<EditText>(R.id.input_text)
        inputText.setText(oldName)
        val btnUpdate = dialog.findViewById<Button>(R.id.btn_update)
        btnUpdate.setOnClickListener {
            listOfFlowers[position] = inputText.text.toString()
            (adapter as BaseAdapter).notifyDataSetChanged()
            dialog.dismiss()
        }
        dialog.show()
    }

    private fun initializeFlowerList() {
        listOfFlowers.add("Roza")
        listOfFlowers.add("Frezja")
        listOfFlowers.add("Bratek")
        listOfFlowers.add("Stokrotka")
        listOfFlowers.add("Przebisnieg")
        listOfFlowers.add("Krokus")
        listOfFlowers.add("Gozdzik")
        listOfFlowers.add("Tulipan")
        listOfFlowers.add("Aster")
        listOfFlowers.add("Chaber")
        listOfFlowers.add("Krokus")
        listOfFlowers.add("Godzik")
        listOfFlowers.add("Tulipan")
        listOfFlowers.add("Aster")
        listOfFlowers.add("Chaber")
        listOfFlowerImageIDs.add(R.drawable.kv1)
        listOfFlowerImageIDs.add(R.drawable.kv2)
        listOfFlowerImageIDs.add(R.drawable.kv3)
        listOfFlowerImageIDs.add(R.drawable.kv1)
        listOfFlowerImageIDs.add(R.drawable.kv2)
        listOfFlowerImageIDs.add(R.drawable.kv3)
        listOfFlowerImageIDs.add(R.drawable.kv1)
        listOfFlowerImageIDs.add(R.drawable.kv2)
        listOfFlowerImageIDs.add(R.drawable.kv3)
        listOfFlowerImageIDs.add(R.drawable.kv1)
        listOfFlowerImageIDs.add(R.drawable.kv2)
        listOfFlowerImageIDs.add(R.drawable.kv3)
        listOfFlowerImageIDs.add(R.drawable.kv1)
        listOfFlowerImageIDs.add(R.drawable.kv2)
        listOfFlowerImageIDs.add(R.drawable.kv3)
    }
}