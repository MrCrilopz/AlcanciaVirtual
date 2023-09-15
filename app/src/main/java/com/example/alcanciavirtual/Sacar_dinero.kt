package com.example.alcanciavirtual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Sacar_dinero : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sacar_dinero)

        val botonSacarDinero = findViewById<Button>(R.id.botonSacarDinero)
        val montoEditText = findViewById<EditText>(R.id.textoSacarDinero)

        botonSacarDinero.setOnClickListener {
            val monto = montoEditText.text.toString().toDoubleOrNull()
            if (monto != null && monto > 0) {
                CuentaSingleton.sacarSaldo(monto)
                // Puedes omitir el registro del movimiento aquí, ya que se hace en CuentaSingleton
                val intent = Intent(this, Principal_y_saldo::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Ingrese un monto válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
