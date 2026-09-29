package com.example.moneda

enum class Moneda(val simbolo: String, val descripcion: String) {
    DOLAR("$", "Dólar Estadounidense"),
    EURO("€", "Euro"),
    PESO("COP$", "Peso Colombiano");

    fun mostrarInfo() {
        println("Moneda: $name | Símbolo: $simbolo | Descripción: $descripcion")
    }
}

fun main() {
    println("--- Lista de Monedas Disponibles ---")
    for (moneda in Moneda.entries) {
        moneda.mostrarInfo()
    }
}
