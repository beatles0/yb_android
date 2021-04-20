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

    private fun displayDetail() {
        id_nick_name.text = intent.getStringExtra("nickName")
        id_real_name.text = intent.getStringExtra("realName")
        id_phone_number.text = intent.getStringExtra("phoneNum")
    }

}