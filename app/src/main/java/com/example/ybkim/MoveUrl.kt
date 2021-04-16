package com.example.ybkim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.move_url.*

class MoveUrl : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_url)

        Log.d("moveUrl:", "-----------------1-----------------")

//        txt_url.setOnFocusChangeListener {
//            Log.d("moveUrl", "setOnClick")
//
//            if ( txt_url.text.equals("url") ) {
//                Log.d("moveUrl", "url 입력")
//                txt_url.setText("")
//            } else {
//                Log.d("moveUrl", "url 입력 x")
//                txt_url.setText("")
//            }
//        }
        Log.d( "moveUrl: " ,  "1111" )
        btn_move.setOnClickListener() {
            Log.d( "moveUrl: " ,  "1111" )
        }

    }


}