package com.example.ybkim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*


class Calculator : AppCompatActivity() {

    var num_result: Int = 0
    var intCount: Int = 0 // 계산할 숫자 갯수
    var isBeforeInt: Boolean = false               // 바로 직전에 숫자를 눌렀나
    var intKeepNum: String = ""
    var intShowNum: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)


        txt_1.setOnClickListener { clickNum(1) }
        txt_2.setOnClickListener { clickNum(2) }
        txt_3.setOnClickListener { clickNum(3) }
        txt_4.setOnClickListener { clickNum(4) }
        txt_5.setOnClickListener { clickNum(5) }
        txt_6.setOnClickListener { clickNum(6) }
        txt_7.setOnClickListener { clickNum(7) }
        txt_8.setOnClickListener { clickNum(8) }
        txt_9.setOnClickListener { clickNum(9) }
        txt_0.setOnClickListener { clickNum(0) }


        /* plus */
        txt_plus.setOnClickListener  {clickCalcu("plus") }
        txt_minus.setOnClickListener {clickCalcu("minus") }
        txt_divide.setOnClickListener {clickCalcu("divide") }
        txt_multi.setOnClickListener {clickCalcu("multi") }


                // 초기화
        txt_c.setOnClickListener {
            intKeepNum = ""
            intShowNum = ""
            intCount = 0
            isBeforeInt = false
            txt_result.setText(intShowNum)
        }

    }

    // 숫자 클릭시 함수
    fun clickNum(intClickNum:Int) {
        if (isBeforeInt) {
            if ( intShowNum == "0")
                intShowNum = intClickNum.toString()
            else
                intShowNum = intShowNum + intClickNum.toString()
        } else {
            intShowNum = intClickNum.toString()
       }
        isBeforeInt = true
        txt_result.setText(intShowNum)
    }

    fun clickCalcu( strCalu:String) {
        intCount++

        // 처음 + 를 누른 경우
        if (intCount < 2) {
            intKeepNum = intShowNum
        } else {
            when ( strCalu) {
                "plus" -> intShowNum = (intKeepNum.toInt() + intShowNum.toInt()).toString()
                "minus" -> intShowNum = (intKeepNum.toInt() - intShowNum.toInt()).toString()
                "multi" -> intShowNum = (intKeepNum.toInt() * intShowNum.toInt()).toString()
                "divide" -> intShowNum = (intKeepNum.toInt() / intShowNum.toInt()).toString()
            }

            intKeepNum = intShowNum
            intCount = 1 // 숫자 누른거 초기화
        }
        isBeforeInt = false
        txt_result.setText(intShowNum)
    }

}


