package com.example.alcanciavirtual

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Principal : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)


        val btnAhorrarDinero: Button = findViewById(R.id.btnAhorrar)
        val txtmontoTotal: TextView = findViewById(R.id.txtSaldo)
        val saldoActual = Cuenta().monto

        txtmontoTotal.setText()
        btnAhorrarDinero.setOnClickListener{

            val intento = Intent(this, AhorrarDinero::class.java)
            startActivity(intento)

        }
    }


}