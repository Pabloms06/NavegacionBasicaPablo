package com.example.aplicacinnavegacinbasica

import android.os.Bundle
import android.widget.ImageView

import androidx.appcompat.app.AppCompatActivity


class MainActivity2 : AppCompatActivity() {
                companion object {
                    const val boton2 = "b"
                }
                override fun onCreate(savedInstanceState: Bundle?) {
                    super.onCreate(savedInstanceState)
                    setContentView(R.layout.activity_main_2)

                    val b = findViewById<ImageView>(R.id.imageView)

                    val src = intent.getStringExtra(boton2)

                    src?.let {
                        b.setImageResource(R.drawable.logo)
                    }
                }
            }
