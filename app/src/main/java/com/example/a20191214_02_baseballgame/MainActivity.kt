package com.example.a20191214_02_baseballgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvent()
        setValues()
    }
    override fun setupEvent() {

    }

    override fun setValues() {

    }

}
