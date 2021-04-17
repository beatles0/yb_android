package com.example.ybkim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.util.Log
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import java.util.*
import kotlin.collections.ArrayList

class AddViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_view_list)

        // 아이템 리스트 준비
        val carList = ArrayList<MyCar>()
        for (i in 0 until 10) {
            carList.add(MyCar("" + i + "st car ", "" + i + "st engine"))
        }

        // 차 이름 리스트
//        for ( i in 0 .. carList.size-1 ) {
//            Log.d("car: ", carList.get(i).carName  + " / "+carList.get(i).carEngine )
//         }

        /*
        이 방법은 가장 자주 사용하는 방법으로, LayoutInflater에 static으로 정의되어있는
        LayoutInflater.from을 통해 LayoutInflater를 만드는 방법입니다.
        내부적으로 context#getSystemService를 호출 하고 있으며,
        같은 context에서는 같은 객체를 리턴하기 때문에 굳이 멤버 변수로 선언해 놓지 않고
        필요할 때마다 호출해서 사용해도 괜찮습니다.

        >> XML레이아웃 파일에서 뷰를 생성할때는 LayoutInflater를 이용해야 한다.
        >> LayoutInflater는 LayoutInflater.from(context)를 이용하여 얻는다.
        >> LayoutInflater객체의 inflate메서드를 이용하여 새로운 뷰를 생성 할 수 있다.
        */
        // inflate 하기
        val container = findViewById<LinearLayout>(R.id.addview_container)
        val inflater: LayoutInflater = LayoutInflater.from(this@AddViewActivity)

        for (i in 0 until carList.size - 1) {
            val itemView = inflater.inflate(R.layout.item_view, null)
            var carNameView = itemView.findViewById<TextView>(R.id.id_car_name)
            val carEngineView = itemView.findViewById<TextView>(R.id.id_engine_name)

            carNameView.setText(carList.get(i).carName)
            carEngineView.setText(carList.get(i).carEngine)
            container.addView(itemView)
            Log.d("car: ", carList.get(i).carName + " / " + carList.get(i).carEngine)
        }

    }

    //    class MyCar(val carName: String, val carEngine: String) {}
    class MyCar {
        var carName: String = ""
        var carEngine: String = ""
        var carSeat: String = ""

        constructor(carName: String, carEngine: String) {
            this.carName = carName
            this.carEngine = carEngine
        }

        constructor(carName: String, carEngine: String, carSeat: String) {
            this.carName = carName
            this.carEngine = carEngine
            this.carSeat = carSeat
        }

    }

}
















