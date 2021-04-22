package com.example.incrementbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.incrementbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.incButton.setOnClickListener { countUp() }
    }

    private fun countUp() {
    var number = binding.textView.text.toString().toInt()
        number++
        binding.textView.text = number.toString()
    }

}