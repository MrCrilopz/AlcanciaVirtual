package com.example.alcanciavirtual

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class Ahorrar_dinero : AppCompatActivity() {
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahorrar_dinero)

        val botonAhorrar = findViewById<Button>(R.id.botonGuardarDinero)
        val montoEditText = findViewById<EditText>(R.id.textoGuardarDinero)
        mediaPlayer = MediaPlayer.create(this,R.raw.water)


        botonAhorrar.setOnClickListener {
            val monto = montoEditText.text.toString().toDoubleOrNull()
            if (monto != null && monto > 0) {
                CuentaSingleton.agregarSaldo(monto)
                mediaPlayer.start()
                val intent = Intent(this, Principal_y_saldo::class.java)
                startActivity(intent)
            }
        }
    }
}
