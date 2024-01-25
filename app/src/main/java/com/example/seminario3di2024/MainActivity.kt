package com.example.seminario3di2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton2= findViewById<Button>(R.id.boton2)

        boton2.setOnClickListener {
            var newIntent= Intent(this, Ejercicio2::class.java)
            startActivity(newIntent)
        }
    }
}