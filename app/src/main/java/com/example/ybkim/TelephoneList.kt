package com.example.ybkim

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ybkim.databinding.ActivityBindingTestBinding
import com.example.ybkim.databinding.ActivityTelephoneListBinding
import kotlinx.android.synthetic.main.activity_telephone_list_in.*

class TelephoneList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telephone_list)

        var arrPhoneList = ArrayList<PhoneListCls>()

        var strRandomNick: String = ""
        var strRandomPhone: String = ""
        var strRandomName: String = ""
        // 데이터 임의로 넣기
        for (i in 0 until 100) {
            strRandomNick = "별명-" + (0..100).random().toString()
            strRandomName = "이름-" + (0..100).random().toString()
            strRandomPhone = "010-" + (0..100).random().toString() + "-" + (0..100).random().toString() + "-" + (0..100).random().toString()

            arrPhoneList.add ( PhoneListCls( nickName= strRandomNick, realName= strRandomName, phoneNum= strRandomPhone) )
        }

        //  출력해보기
        /*
        for ( i in 0 until ( arrPhoneList.size -1) ) {
            Log.d("phone: ", "========= $i =================" )
            Log.d("phone: ", arrPhoneList.get(i).nickName )
            Log.d("phone: ", arrPhoneList.get(i).realName )
            Log.d("phone: ", arrPhoneList.get(i).phoneNum )
            Log.d("phone: ", "==========================" )

        }
        */

        // view binding 을 사용한 예제.
        /*
        binding = ActivityBindingTestBinding.inflate(layoutInflater)
        var root_view = binding.root
        setContentView(root_view)

        binding.idButton.setOnClickListener {
            if (toggle) binding.idTextView.text = "ok click"
            else binding.idTextView.text = "Hello World"
            toggle = !toggle
        }
        */

        // inflate 하기
        val container = findViewById<LinearLayout>(R.id.id_phone_list)

        val inflater: LayoutInflater = LayoutInflater.from(this@TelephoneList)

        for (i in 0 until arrPhoneList.size - 1) {
            val itemView = inflater.inflate(R.layout.activity_telephone_list_in, null)
            var nickNameView = itemView.findViewById<TextView>(R.id.id_nick_name)
            val phoneNumView= itemView.findViewById<TextView>(R.id.id_phone_number)

            nickNameView.setText(arrPhoneList.get(i).nickName)
            phoneNumView.setText(arrPhoneList.get(i).phoneNum)
            container.addView(itemView)
            Log.d("car: ", arrPhoneList.get(i).nickName + " / " + arrPhoneList.get(i).phoneNum)
        }

        id_nick_name.setOnClickListener {
            
        }

    }

     /*
     아래처럼 picture: String = "" default 생성자를 주니까 위에
     arrPhoneList.add ( PhoneListCls( nickName= strRandomNick, realName= strRandomName, phoneNum= strRandomName) )
     에서 애러가 나지 않는다.
     */

    class PhoneListCls(var nickName: String, var realName: String, var phoneNum: String, var picture: String= "")
    { }
}

