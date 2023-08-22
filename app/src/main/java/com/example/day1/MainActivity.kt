package com.example.day1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.day1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            id1.setOnClickListener{
                Toast.makeText(this@MainActivity, "Login Berhasil!", Toast.LENGTH_LONG).show()
            }
            id2.setOnClickListener {
                System.exit(0)
            }
        }
    }
}