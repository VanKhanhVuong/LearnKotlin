package com.example.demovuong

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.demovuong.databinding.TestActivityBinding

class TestActivity : AppCompatActivity() {


    private lateinit var binding: TestActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TestActivityBinding.inflate(layoutInflater)
    }
}