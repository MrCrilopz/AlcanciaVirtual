package com.example.alcanciavirtual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class Principal_y_saldo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_y_saldo)

        val botonAhorrar = findViewById<Button>(R.id.botonAhorrarPrincipal)
        val botonSacar = findViewById<Button>(R.id.botonSacarPrincipal)
        val botonVerHistorial = findViewById<Button>(R.id.botonVerHistorialPrincipal)
        val saldoTextView = findViewById<TextView>(R.id.saldoTextView)

        // Obtener el saldo actualizado
        val saldoActualizado = CuentaSingleton.cuenta.saldo

        // Actualizar el TextView con el nuevo saldo
        saldoTextView.text = saldoActualizado.toString()

        botonAhorrar.setOnClickListener {
            val intent = Intent(this, Ahorrar_dinero::class.java)
            startActivity(intent)
        }

        botonSacar.setOnClickListener {
            val intent = Intent(this, Sacar_dinero::class.java)
            startActivity(intent)
        }

        botonVerHistorial.setOnClickListener {
            val intent = Intent(this, Historial::class.java)
            startActivity(intent)
        }
    }
}