import com.example.alcanciavirtual.Cuenta
import java.text.SimpleDateFormat
import java.util.Date
import java.util.TimeZone

object CuentaSingleton {
    val cuenta = Cuenta()
    val movimientos = mutableListOf<String>()

    fun agregarSaldo(monto: Double) {
        cuenta.agregarSaldo(monto)
        val movimiento = "Depositado: $monto"
        registrarMovimiento(movimiento)
    }

    fun sacarSaldo(monto: Double) {
        if (cuenta.saldo >= monto) {
            cuenta.sacarSaldo(monto)
            val movimiento = "Retirado: $monto"
            registrarMovimiento(movimiento)
        }
    }

    private fun registrarMovimiento(movimiento: String) {
        // Obtener la fecha y hora actual en la zona horaria de Bogotá (GMT-5)
        val formato = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
        formato.timeZone = TimeZone.getTimeZone("America/Bogota")
        val fechaHora = formato.format(Date())

        // Agregar el movimiento con fecha y hora al historial
        movimientos.add("$fechaHora - $movimiento")
    }
}
