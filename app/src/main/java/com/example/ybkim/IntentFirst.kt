package com.example.ybkim

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_intent_first.*

class IntentFirst : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_first)

        btn_first_move.setOnClickListener {
            Log.d("intent:", "============================")
            Log.d("intent: ", "btn first move click ")

            var  itnt_first = Intent (this@IntentFirst , IntentSecond::class.java)
            startActivity(itnt_first)

        }
    }
}