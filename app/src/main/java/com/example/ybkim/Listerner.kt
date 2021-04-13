package com.example.ybkim

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Listerner : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listerner)

        val textView: TextView = findViewById(R.id.dirdir)

        textView.setText("1212121212")

        Log.d("life_cycle", "onStart")

        textView.setOnClickListener {
            Log.d("life_cycle", "onStart")
        }
    }

}

