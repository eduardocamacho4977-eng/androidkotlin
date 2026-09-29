package com.example.automovil

class Automovil(val marca: String, val modelo: String, val anio: Int) {
    // Constructor secundario con año por defecto 2026
    constructor(marca: String, modelo: String) : this(marca, modelo, 2026)

    fun mostrarDetalles() {
        println("Vehículo: $marca $modelo | Modelo/Año: $anio")
    }
}

fun main() {
    val auto1 = Automovil("Toyota", "Corolla Cross", 2024)
    val auto2 = Automovil("Mazda", "CX-30") // Utiliza el constructor secundario

    auto1.mostrarDetalles()
    auto2.mostrarDetalles()
}
