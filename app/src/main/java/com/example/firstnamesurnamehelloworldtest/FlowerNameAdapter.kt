package com.example.firstnamesurnamehelloworldtest

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ListView
import android.widget.TextView
import androidx.core.content.ContextCompat

class FlowerNameAdapter: BaseAdapter {
    private var context: Context
    private var flowerNames: ArrayList<String>
    private var flowerImages: ArrayList<Int>

    constructor(
        context: Context,
        flowerNames: ArrayList<String>,
        flowerImages: ArrayList<Int>) : super() {
        this.context = context
        this.flowerNames = flowerNames
        this.flowerImages = flowerImages
    }

    override fun getCount(): Int {
        return flowerNames.size
    }

    override fun getItem(position: Int): Any {
        return flowerNames[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val layoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val itemView = layoutInflater.inflate(R.layout.flower_list_item, null, true)
        val flowerNameTextView = itemView.findViewById<TextView>(R.id.flower_name) as TextView
        val flowerImageView = itemView.findViewById<ImageView>(R.id.flower_image) as ImageView

        if (position % 2 == 1) {
            itemView.setBackgroundColor(ContextCompat.getColor(context, R.color.purple_700))
        }
        else {
            itemView.setBackgroundColor(ContextCompat.getColor(context, R.color.teal_200))
        }
        flowerNameTextView.text = getItem(position).toString()
        flowerImageView.setImageResource(flowerImages[position])
        return itemView
    }
}