package com.example.alcanciavirtual

class Cuenta {
    var saldo: Double = 0.0

    fun agregarSaldo(monto: Double){
        if (monto >= 0) {
            saldo += monto
        }
    }

    fun sacarSaldo(monto: Double){
        if (saldo>monto){
            saldo-=monto
        }
    }
}