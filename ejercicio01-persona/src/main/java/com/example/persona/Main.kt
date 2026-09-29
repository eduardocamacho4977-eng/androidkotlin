package com.example.persona

class Persona(val nombre: String, val edad: Int, val ciudad: String) {
    fun presentarse() {
        println("¡Hola! Mi nombre es $nombre, tengo $edad años y vivo en $ciudad.")
    }
}

fun main() {
    val usuario = Persona("Juan Eduardo", 22, "Popayán")
    usuario.presentarse()
}
