package com.example.alcanciavirtual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.util.Log


class Principal_y_saldo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal_y_saldo)

        val botonAhorrar = findViewById<Button>(R.id.botonAhorrarPrincipal)
        val botonSacar = findViewById<Button>(R.id.botonSacarPrincipal)
        val botonVerHistorial = findViewById<Button>(R.id.botonVerHistorialPrincipal)

        // Configurar un OnClickListener para el botón "Ahorrar dinero"
        botonAhorrar.setOnClickListener {
            Log.d("MiApp", "Botón Ahorrar clickeado")
            val intent = Intent(this, Ahorrar_dinero::class.java)
            startActivity(intent)
        }

        // Configurar un OnClickListener para el botón "Sacar dinero"
        botonSacar.setOnClickListener {
            val intent = Intent(this, Sacar_dinero::class.java)
            startActivity(intent)
        }

        // Configurar un OnClickListener para el botón "Ver historial"
        botonVerHistorial.setOnClickListener {
            val intent = Intent(this, Historial::class.java)
            startActivity(intent)
        }
    }
}