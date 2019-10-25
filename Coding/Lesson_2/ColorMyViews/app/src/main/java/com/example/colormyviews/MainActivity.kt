package com.example.colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.colormyviews.R.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
                listOf(box_one_text, box_two_text, box_three_text, box_four_text, box_five_text, constraint_layout, red_button, yellow_button, green_button)

        for (item in clickableViews){
            item.setOnClickListener{makeColored(it)}
        }
    }

    private fun makeColored(view: View) {
        when (view.id) {

            // Boxes using Color class colors for background
            id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            id.box_two_text -> view.setBackgroundColor(Color.GRAY)

            // Boxes using Android color resources for background
            id.box_three_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            id.box_four_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            id.box_five_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            // Boxes using custom colors for background
            R.id.red_button -> box_three_text.setBackgroundResource(color.my_red)
            R.id.yellow_button -> box_four_text.setBackgroundResource(color.my_yellow)
            R.id.green_button -> box_five_text.setBackgroundResource(color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}