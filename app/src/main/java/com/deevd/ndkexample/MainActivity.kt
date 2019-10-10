package com.deevd.ndkexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("CAll C " , invokeNativeFunction())
    }

    companion object {
        init {
            System.loadLibrary("native-lib")
        }
    }
    private external fun invokeNativeFunction(): String
}
