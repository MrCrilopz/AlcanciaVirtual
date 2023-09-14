package com.example.alcanciavirtual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Ahorrar_dinero : AppCompatActivity() {

    private lateinit var montoEditText: EditText
    private lateinit var guardarButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahorrar_dinero)

        // Obtener referencias a los elementos de la interfaz
        montoEditText = findViewById(R.id.Ahorrar_saldoTextView)
        guardarButton = findViewById(R.id.botonGuardarDinero)

        // Configurar un OnClickListener para el botón "Guardar"
        guardarButton.setOnClickListener {
            // Obtener el monto ingresado por el usuario como texto
            val montoStr = montoEditText.text.toString()

            // Verificar si el campo de monto no está vacío
            if (montoStr.isNotEmpty()) {
                try {
                    // Convertir el monto a un número decimal
                    val monto = montoStr.toDouble()

                    // Aquí puedes implementar la lógica para guardar el monto en la alcancía virtual

                    // Mostrar un mensaje de éxito
                    Toast.makeText(this, "Monto guardado con éxito: $monto", Toast.LENGTH_SHORT).show()

                    // Limpiar el campo de monto
                    montoEditText.text.clear()
                } catch (e: NumberFormatException) {
                    // Manejar errores si el usuario ingresa un valor no válido
                    Toast.makeText(this, "Ingrese un monto válido", Toast.LENGTH_SHORT).show()
                }
            } else {
                // Mostrar un mensaje si el campo de monto está vacío
                Toast.makeText(this, "Ingrese un monto", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
