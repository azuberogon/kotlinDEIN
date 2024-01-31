package com.example.ventanasdeaitor

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SaludorActivity : AppCompatActivity() {
    private lateinit var txtNombre: EditText
    private lateinit var btnAceptar: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludor)

        txtNombre = findViewById(R.id.txtNombre)
        btnAceptar= findViewById(R.id.btnAceptar)

        btnAceptar.setOnClickListener{
            //val intent = Intent(this@MainActivity , SaludorActivity::class.java.java)

            val  b = Bundle()
            b.putString("NOMBRE", txtNombre.text.toString())

            intent.putExtras(b)
            startActivity(intent)
        }
    }
}