package com.example.botonesdeaitor

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val numBotones = 10
    private lateinit var llBotonera: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        llBotonera = findViewById(R.id.llBotonera)

        val lp = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        for (i in 0 until numBotones) {
            val button = Button(this)
            button.layoutParams = lp
            button.text = "Botón " + String.format("%02d", i)
            button.setOnClickListener(buttonClickListener(i))
            llBotonera.addView(button)
        }
    }

    private fun buttonClickListener(index: Int): View.OnClickListener {
        return View.OnClickListener {
            val isLuckyButton = Random.nextBoolean()
            if (isLuckyButton) {
                showToast("ME ENCONTRASTE!!")
            } else {
                showToast("Sigue buscando")
            }
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
    }
}
