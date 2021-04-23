package com.example.ybkim.tel

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ybkim.R
import kotlinx.android.synthetic.main.activity_intent_second.*

class IntentSecond : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_second)

        Log.d("intent:", "intentSecond Create")

        Log.d("intent:", intent.getStringExtra("Data1").toString())
        Log.d("intent:", intent.getStringExtra("Data2").toString())

        /* btn click */
        btn_second_move.setOnClickListener {
            Log.d("intent:", "============second================")
            Log.d("intent: ", "btn second  move click")
            /*
            아래처럼 finish  로 해도 second activity 가 종료되므로 첫번째 화면이 나온다.
             */
            //            finish()

            /* 이렇게 아래처럼 하면 변수가 잘 가긴 한다 */
            var itnt_second = Intent(this@IntentSecond, IntentFirst::class.java)
                // 변수 넘기기
                .apply {
                    putExtra("Data1", "second->first 오마이 갓김치")
                    putExtra("Data2", "second->first 오마이 가스라이터")
                }
            startActivity(itnt_second)
        }

        // 종료 버튼을 누르면 실행되는 콜백 함수
        btn_second_finish.setOnClickListener {
            Log.d("intent: ", "btn second  finish click")

            var returnIntent = Intent()
            returnIntent.putExtra("Data1", "종료되면서 return  하는 데이터")
            setResult(Activity.RESULT_OK, returnIntent)
            finish()
        }


    }


}