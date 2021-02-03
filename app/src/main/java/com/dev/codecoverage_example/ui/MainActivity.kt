package com.dev.codecoverage_example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dev.codecoverage_example.databinding.ActivityMainBinding
import com.dev.codecoverage_example.firebase.TextMethods

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.save.setOnClickListener {
            //   showt.text = TextMethods.counttext(addtitle.text.toString(), adddescription.text.toString()).toString()

            binding.showt.text =
                TextMethods.capitalizeText(
                    binding.addtitle.text.toString(),
                    binding.adddescription.text.toString()
                )

        }
    }

}