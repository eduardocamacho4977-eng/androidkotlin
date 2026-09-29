package com.example.libros

data class Libro(
    val titulo: String,
    val autor: String,
    val anioPublicacion: Int,
    val paginas: Int
)

fun main() {
    val libroOriginal = Libro("Clean Code", "Robert C. Martin", 2008, 464)
    // Se duplica modificando solo el año de edición
    val nuevaEdicion = libroOriginal.copy(anioPublicacion = 2025)

    println("Original: $libroOriginal")
    println("Edición Actualizada: $nuevaEdicion")
}
