package com.example.aplicacinnavegacinbasica

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_3)


        val boton2 = findViewById<Button>(R.id.boton2)
        val texto = findViewById<EditText>(R.id.textoedit)
        val texto2 = findViewById<TextView>(R.id.textView)

        boton2.setOnClickListener {
            val intent2 = Intent(this, MainActivity3::class.java)

           val longitud = texto.length()
            texto2.text = "El edit text de la activity anterior tenía una longitud de "+longitud+ " caracteres"

            startActivity(intent2)
        }
    }

    }