package com.example.gittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("debug", "onCreate()")
        Log.d("debug", "あああああ")
    }

    // feature/p2ブランチ作成

    // developブランチ作成
}
