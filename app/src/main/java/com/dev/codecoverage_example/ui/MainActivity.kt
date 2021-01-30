package com.dev.codecoverage_example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.dev.codecoverage_example.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val arrayvalue = arrayOf("akuko", "ilu", "egwuregwu")
        val adapter = ArrayAdapter(
            applicationContext!!,
            android.R.layout.simple_list_item_1,
            arrayvalue
        )
        binding.autoCompletevalue.setAdapter(adapter)
    }
}