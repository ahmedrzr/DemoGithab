package com.news.demogithab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private  val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(TAG, "onCreate: BHAVANI" )
        Log.i(TAG, "onCreate: BHAVANI2")
        Log.i(TAG, "onCreate: BHAVANI3")
        Log.i(TAG, "onCreate: BHAVANI4")
        Log.i(TAG, "onCreate: BHAVANI5")
    }
}