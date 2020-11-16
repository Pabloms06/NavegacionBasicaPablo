package com.example.aplicacinnavegacinbasica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

        class MainActivity : AppCompatActivity() {
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val boton = findViewById<Button>(R.id.button1)

                boton.setOnClickListener {
                    val intent = Intent(this, MainActivity3::class.java)
                    startActivity(intent)
                }
            }
        }
    }
