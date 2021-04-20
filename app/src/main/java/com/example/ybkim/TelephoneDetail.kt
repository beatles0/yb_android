package com.example.ybkim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.activity.OnBackPressedDispatcherOwner
import kotlinx.android.synthetic.main.activity_telephone_detail.*

class TelephoneDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telephone_detail)

        displayDetail()
        id_go_back.setOnClickListener {
            onBackPressed()
        }
    }

    fun displayDetail() {
        id_nick_name.setText(intent.getStringExtra("nickName"))
        id_real_name.setText(intent.getStringExtra("realName"))
        id_phone_number.setText(intent.getStringExtra("phoneNum"))
    }

}