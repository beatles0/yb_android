package com.example.ybkim

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class TelephoneList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telephone_list)

        var arrPhoneList = ArrayList<PhoneListCls>()

        var strRandomNick: String = ""
        var strRandomPhone: String = ""
        var strRandomName: String = ""
        // 데이터 임의로 넣기
        for (i in 0 until 10) {
            strRandomNick = "별명-" + (0..100).random().toString()
            strRandomPhone = "010" + (0..100).random().toString() + "-" + (0..100).random().toString() + "-" + (0..100).random().toString()
            strRandomName = "이름-" + (0..100).random().toString()
        }
    }

    // phone list class
    class PhoneListCls(nickName: String, realName: String, phoneNum: String, picture: String) {}
}

