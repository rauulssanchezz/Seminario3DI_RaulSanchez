package com.example.seminario3di2024

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var boton1=findViewById<Button>(R.id.boton1)
        var boton2= findViewById<Button>(R.id.boton2)
        var boton3=findViewById<Button>(R.id.boton3)

        boton1.setOnClickListener{
            var newIntent= Intent(this, Ejercicio1::class.java)
            startActivity(newIntent)
        }

        boton2.setOnClickListener {
            var newIntent= Intent(this, Ejercicio2::class.java)
            startActivity(newIntent)
        }

        boton3.setOnClickListener {
            var newIntent= Intent(this, Ejercicio3::class.java)
            startActivity(newIntent)
        }
    }
}