package com.example.events

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.events.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var B: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        B = ActivityMainBinding.inflate(layoutInflater)
        setContentView(B.root)

        // It is common sense to use strings!
        B.buDeutsch.setOnClickListener {
            B.tvAusgabe.text = getString(R.string.tvAusgabeDeutsch)
        }

        // Set text without strings.xml
        B.buEnglisch.setOnClickListener {
            B.tvAusgabe.text = "Good morning"
        }

    }
}