package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val boton = findViewById<Button>(R.id.btn)
        boton.setOnClickListener(){
            val entradanombre =findViewById<TextView>(R.id.txting)
            val enviarmensajes = findViewById<TextView>(R.id.txtmen)
            enviarmensajes.text = "Hola  " + entradanombre.text
        }
    }
}