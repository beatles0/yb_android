package com.example.ybkim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_library_actitivy.*

class library_actitivy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library_actitivy)

        var imgDaum = getString ( R.string.imgdaum )

        Glide.with(this)
            .load(imgDaum)
            .into(gilde);

        Glide.with(this)
            .load(imgDaum)
            .circleCrop()
            .into(gilde2);


    }
}