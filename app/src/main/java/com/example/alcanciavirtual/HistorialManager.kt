package com.example.alcanciavirtual

object HistorialManager {
    private val listHistorial: MutableList<Cuenta> = mutableListOf()

    fun add(transaccion: Cuenta){
        listHistorial.add(transaccion)
    }

    fun getAll(): MutableList<Cuenta>{
        return  listHistorial
    }
}