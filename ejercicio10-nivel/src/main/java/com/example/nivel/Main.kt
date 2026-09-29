package com.example.nivel

enum class Nivel(val puntos: Int) {
    BAJO(10),
    MEDIO(50),
    ALTO(100);

    fun esMayorQue(otroNivel: Nivel): Boolean {
        return this.puntos > otroNivel.puntos
    }
}

fun main() {
    val nivelJugador = Nivel.ALTO
    val nivelEnemigo = Nivel.MEDIO

    if (nivelJugador.esMayorQue(nivelEnemigo)) {
        println("El nivel ${nivelJugador.name} (${nivelJugador.puntos} pts) es MAYOR que ${nivelEnemigo.name} (${nivelEnemigo.puntos} pts).")
    } else {
        println("El nivel ${nivelJugador.name} no es mayor.")
    }
}
