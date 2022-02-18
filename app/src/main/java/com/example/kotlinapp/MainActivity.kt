package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.kotlinapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private lateinit var binding: ActivityMainBinding
    private lateinit var helloTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //binding = ActivityMainBinding.inflate(layoutInflater)
        //val view = binding.root
        setContentView(R.layout.activity_main)


        //binding.helloTextView.text = "Hello Kotlin"
        helloTextView = findViewById(R.id.helloTextView)
        helloTextView.text = "Hello Kotlin!"
    }

    fun changeText(view: View) {
        helloTextView.text = "Hey there"
    }
}