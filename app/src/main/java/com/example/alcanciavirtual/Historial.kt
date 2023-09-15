package com.example.alcanciavirtual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Historial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historial)

        val historialTextView = findViewById<TextView>(R.id.historialTextView)

        // Obtener la lista de movimientos desde CuentaSingleton
        val movimientos = CuentaSingleton.movimientos

        // Mostrar los movimientos en el TextView
        historialTextView.text = movimientos.joinToString("\n")
    }
}