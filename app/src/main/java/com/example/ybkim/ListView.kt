package com.example.ybkim

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        // 아이템 리스트 준비
        val carList = ArrayList<AddViewActivity.MyCar>()
        for (i in 0 until 10) {
            carList.add(AddViewActivity.MyCar("" + i + "st car ", "" + i + "st engine"))
        }

        val adapter = ListViewAdapter(carList, LayoutInflater.from( this@ListView) )

        

    }

}

class ListViewAdapter (
    val carForList : ArrayList<AddViewActivity.MyCar>,
    val layoutInflater: LayoutInflater
): BaseAdapter( ) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = layoutInflater.inflate(R.layout.item_view, null )
        val carNameTextView = view.findViewById<TextView>( R.id.id_car_name)
        val carEngineTextView = view.findViewById<TextView>( R.id.id_engine_name)
        carNameTextView.setText(carForList.get(position).carName)
        carNameTextView.setText(carForList.get(position).carEngine)
        return view
    }

    // 그리고자 하는 아이템 리스트의 전체 갯수
    override fun getCount(): Int {
        return carForList.size
    }

    override fun getItem(position: Int): Any {
        // 그리고자 하는 아이템 리스트의 하나 ( 포지션에 해당하는 )
        return carForList.get(position)
    }

    override fun getItemId(position: Int): Long {
        // 해당 포지션에 위치해 있는 이이템의 아이디 설정
        return position.toLong()
    }


}


