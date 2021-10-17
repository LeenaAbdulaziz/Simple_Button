package com.example.simple_button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var b:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b=findViewById(R.id.button2)
        b.setOnClickListener {
            Toast.makeText(applicationContext,"Kotlin",Toast.LENGTH_SHORT).show()

        }
    }

    fun xlm(view: View) {
        Toast.makeText(applicationContext,"xml",Toast.LENGTH_SHORT).show()
    }
}