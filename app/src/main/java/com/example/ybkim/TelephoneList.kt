package com.example.ybkim

//import com.example.ybkim.databinding.ActivityBindingTestBinding
//import com.example.ybkim.databinding.ActivityTelephoneListBinding
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_binding_test.*
import kotlinx.android.synthetic.main.activity_telephone_list.*
import kotlinx.android.synthetic.main.activity_telephone_list_in.*

class TelephoneList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telephone_list)

        var arrPhoneList: ArrayList<PhoneListCls> = addTelephoneList()
        displayTelephoneList(arrPhoneList)

    } // end of create

    fun addTelephoneList(): ArrayList<PhoneListCls> {
        var arrPhoneList = ArrayList<PhoneListCls>()
        var strRandomNick: String = ""
        var strRandomPhone: String = ""
        var strRandomName: String = ""
        // 데이터 임의로 넣기
        for (i in 0 until 100) {
            strRandomNick = "별명-" + (0..100).random().toString()
            strRandomName = "이름-" + (0..100).random().toString()
            strRandomPhone = "010-" + (0..100).random().toString() + "-" + (0..100).random().toString() + "-" + (0..100).random().toString()
            arrPhoneList.add(PhoneListCls(nickName = strRandomNick, realName = strRandomName, phoneNum = strRandomPhone))
        }
        return arrPhoneList
    }

    fun displayTelephoneList(arrPhoneList: ArrayList<PhoneListCls>) {
        val container = findViewById<LinearLayout>(R.id.id_phone_list)
        val inflater: LayoutInflater = LayoutInflater.from(this@TelephoneList)

        for (i in 0 until arrPhoneList.size - 1) {
            val itemView = inflater.inflate(R.layout.activity_telephone_list_in, null)
            var nickNameView = itemView.findViewById<TextView>(R.id.id_nick_name)
            val phoneNumView = itemView.findViewById<TextView>(R.id.id_phone_number)

            nickNameView.setText(arrPhoneList.get(i).nickName)
            phoneNumView.setText(arrPhoneList.get(i).phoneNum)

            clickListerPhone(arrPhoneList.get(i) , itemView )

            container.addView(itemView)
        }
    }

    fun clickListerPhone(arrPhoneList: PhoneListCls, view: View) {
        view.setOnClickListener {
            val YB_REQUEST_CODE: Int = 100
            var itnt_first = Intent(this@TelephoneList , TelephoneDetail::class.java)
                    // 변수 넘기기
                    .apply {
                        putExtra("nickName", arrPhoneList.nickName)
                        putExtra("realName", arrPhoneList.realName)
                        putExtra("phoneNum", arrPhoneList.phoneNum)
                    }
            startActivityForResult(itnt_first, YB_REQUEST_CODE)
        }
    }

/*
아래처럼 picture: String = "" default 생성자를 주니까 위에
arrPhoneList.add ( PhoneListCls( nickName= strRandomNick, realName= strRandomName, phoneNum= strRandomName) )
에서 애러가 나지 않는다.
*/

    class PhoneListCls(var nickName: String, var realName: String, var phoneNum: String, var picture: String = "") {}
}

