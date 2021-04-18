package com.example.ybkim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import com.example.ybkim.databinding.ActivityBindingTestBinding
import kotlinx.android.synthetic.main.activity_binding_test.*
import kotlinx.android.synthetic.main.activity_intent_second.*
import org.w3c.dom.Text

class BindingTest : AppCompatActivity() {
    private lateinit var binding: ActivityBindingTestBinding

    var toggle: Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_binding_test)

        // view binding 을 사용한 예제.
        binding = ActivityBindingTestBinding.inflate(layoutInflater)
        var root_view = binding.root
        setContentView(root_view)

        binding.idButton.setOnClickListener {
            if (toggle) binding.idTextView.text = "ok click"
            else binding.idTextView.text = "Hello World"
            toggle = !toggle
        }

        // 기존  kotlin-android-extensions 사용
//        val id_textview: TextView = findViewById<TextView>(R.id.id_textView)
//        val button: Button = findViewById<Button>(R.id.id_button)
//
//        id_button.setOnClickListener {
//            id_textview.text = "ok world"
//
//            if (toggle) id_textview.text = "ok world"
//            else id_textview.text = "Hello World"
//
//            toggle = !toggle
//        }
    }
}