package com.example.ybkim.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ybkim.R


class ThreadTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread_sample)


        val runnable: Runnable = object: Runnable{
            override fun run() {
                Log.d("thread-1", "thread is made")
            }

        }
        val thread: Thread = Thread(runnable)

        thread.start()

        Thread(object: Runnable {
            override fun run() {
                Log.d("thread-1", "thread2 is made")
            }
        }).start()

        Thread(Runnable {
            Thread.sleep(2000)
            Log.d("thread-1", "thread3 is made")
        } ).start()


    }
}