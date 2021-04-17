package com.example.ybkim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent_second.*

class IntentSecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_second)

        Log.d("intent:", "intentSecond Create")

        btn_second_move.setOnClickListener {
            Log.d("intent: ", "btn second  move click")
            finish()
        }

    }



}