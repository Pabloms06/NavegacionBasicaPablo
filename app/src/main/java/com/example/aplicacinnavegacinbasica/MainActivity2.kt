package com.example.aplicacinnavegacinbasica


import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_2)

        val Imagen = findViewById<ImageView>(R.id.imageView)

           Imagen.setImageResource(R.drawable.logo)
        }

    }
