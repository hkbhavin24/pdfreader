package com.example.pdfreader

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.pdfreader.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Handler().postDelayed({

            var i = Intent(
                this@MainActivity,
                MainActivity2::class.java
            )

            startActivity(i)

            finish()
        }, 4000)



    }
}