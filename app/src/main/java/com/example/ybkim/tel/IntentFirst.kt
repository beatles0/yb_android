package com.example.ybkim.tel

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ybkim.R
import kotlinx.android.synthetic.main.activity_intent_first.*

abstract class IntentFirst : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_first)

        Log.d("intent:", "intentFirst Create")
        Log.d("intent:", intent.getStringExtra("Data1").toString())
        Log.d("intent:", intent.getStringExtra("Data2").toString())


        /* btn click */
        btn_first_move.setOnClickListener {
            Log.d("intent:", "============first================")
            Log.d("intent: ", "btn first move click ")

            val YB_REQUEST_CODE: Int = 100
            var itnt_first = Intent(this@IntentFirst, IntentSecond::class.java)
                // 변수 넘기기
                .apply {
                    putExtra("Data1", "first->second 오마이 갓 김치")
                    putExtra("Data2", "first->second 오마이 가스라이터")
                }

            // startActivity 만 호출하면 second 가 finish 될때 변수를 받지 못한다.
            // startActivity(itnt_first)

            // second 가  finish 될때 변수를 받으려면 아래처럼 startActivityForResult  를 호출 해야 한다.
            startActivityForResult(itnt_first, YB_REQUEST_CODE)


        }

    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        Log.d("intent: ", "first onActivityResult call ")
        Log.d("intent: ", "requestCode:  $requestCode ")
        Log.d("intent: ", "Activity.RESULT_OK:  ${Activity.RESULT_OK} ")
        if ( resultCode == Activity.RESULT_OK) {
            Log.d("intent: ", "result ok ")
            Log.d("intent:", data?.getStringExtra("Data1").toString())
        }
    }


}