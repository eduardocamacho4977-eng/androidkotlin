package com.example.diasemana

enum class DiaSemana(val numero: Int) {
    LUNES(1),
    MARTES(2),
    MIERCOLES(3),
    JUEVES(4),
    VIERNES(5),
    SABADO(6),
    DOMINGO(7);

    companion object {
        fun obtenerPorNumero(num: Int): String {
            val dia = entries.find { it.numero == num }
            return dia?.name ?: "Número de día inválido (debe ser entre 1 y 7)"
        }
    }
}

fun main() {
    val opcion = 5 // Puedes cambiar este número del 1 al 7
    println("El día seleccionado es: ${DiaSemana.obtenerPorNumero(opcion)}")
}
