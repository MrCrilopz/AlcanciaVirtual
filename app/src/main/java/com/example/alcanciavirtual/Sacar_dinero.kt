package com.example.alcanciavirtual

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Sacar_dinero : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sacar_dinero)

        val botonSacarDinero = findViewById<Button>(R.id.botonSacarDinero)
        val montoEditText = findViewById<EditText>(R.id.textoSacarDinero)

        mediaPlayer = MediaPlayer.create(this,R.raw.water)
        botonSacarDinero.setOnClickListener {

            val monto = montoEditText.text.toString().toDoubleOrNull()
            if (monto != null && monto > 0) {
                CuentaSingleton.sacarSaldo(monto)
                val intent = Intent(this, Principal_y_saldo::class.java)
                startActivity(intent)
                mediaPlayer.start()
            } else {
                Toast.makeText(this, "Ingrese un monto válido", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
