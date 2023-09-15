package com.example.alcanciavirtual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Ahorrar_dinero : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahorrar_dinero)

        val botonAhorrar = findViewById<Button>(R.id.botonGuardarDinero)
        val montoEditText = findViewById<EditText>(R.id.textoGuardarDinero)

        botonAhorrar.setOnClickListener {
            val monto = montoEditText.text.toString().toDoubleOrNull()
            if (monto != null && monto > 0) {
                CuentaSingleton.agregarSaldo(monto)
                // Puedes omitir el registro del movimiento aquí, ya que se hace en CuentaSingleton
                val intent = Intent(this, Principal_y_saldo::class.java)
                startActivity(intent)
            }
        }
    }
}
