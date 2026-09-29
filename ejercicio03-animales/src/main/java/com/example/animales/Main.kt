package com.example.animales

open class Animal(val nombre: String) {
    open fun hacerSonido() {
        println("$nombre hace un sonido indeterminado.")
    }
}

class Perro(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre dice: ¡Guau guau!")
    }
}

class Gato(nombre: String) : Animal(nombre) {
    override fun hacerSonido() {
        println("$nombre dice: ¡Miau miau!")
    }
}

fun main() {
    val mascotas: List<Animal> = listOf(
        Perro("Rocky"),
        Gato("Michi"),
        Perro("Kira")
    )

    for (animal in mascotas) {
        animal.hacerSonido()
    }
}
