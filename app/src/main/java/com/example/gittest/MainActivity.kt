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
        Log.d("debug", "feature/p1 変更3")

    }

    // feature/p2ブランチ作成

    // developブランチ作成

    // feature/p1ブランチ作成
}
