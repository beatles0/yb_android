package com.example.ybkim.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ybkim.R
import kotlinx.android.synthetic.main.activity_resouce.*

class ResourceTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resouce)

        // 1
        var ment = resources.getString(R.string.hello)
        Log.d("ment", ment)

        // 2
        val ment2 = getString(R.string.hello)
        Log.d("ment", ment)

        // 3
        val color2 = resources.getColor(R.color.black)
        Log.d("ment", "color:" + color2)

        //4
        val color3 = getColor(R.color.black)
        Log.d("ment", "color:" + color3)

        mybutton.setBackgroundColor( getColor(R.color.design_default_color_error) )
    }
}