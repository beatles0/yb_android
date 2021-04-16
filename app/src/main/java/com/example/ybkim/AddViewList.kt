package com.example.ybkim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.LinearLayout
import java.util.*
import kotlin.collections.ArrayList

class AddViewList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_view_list)

        // 아이템 리스트 준비
        val carList = ArrayList<MyCar>()
        for ( i in 0 until 10 ) {
            carList.add(MyCar(""+ i + "번째 이름 ", "" + i + "번째 엔진"))
        }

        val container = findViewById<LinearLayout>(R.id.id_top_linear)
        val inflater = LayoutInflater.from( this)

        for( i in 0 until carList.size) {

        }

    }

    class MyCar( carName:String, carEngine:String) {}

}