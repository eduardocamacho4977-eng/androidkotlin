package com.example.pato

interface Volador {
    fun volar()
}

interface Nadador {
    fun nadar()
}

class Pato(val nombre: String) : Volador, Nadador {
    override fun volar() {
        println("$nombre está volando sobre el lago.")
    }

    override fun nadar() {
        println("$nombre está nadando plácidamente en el agua.")
    }
}

fun main() {
    val miPato = Pato("Lucas")
    miPato.volar()
    miPato.nadar()
}
