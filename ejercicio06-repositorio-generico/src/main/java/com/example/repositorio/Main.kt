package com.example.repositorio

interface Repositorio<T> {
    fun agregar(item: T)
    fun obtener(id: Int): T?
    fun eliminar(id: Int)
    fun tamano(): Int
}

class RepositorioMemoria<T> : Repositorio<T> {
    private val lista = mutableListOf<T>()

    override fun agregar(item: T) {
        lista.add(item)
    }

    override fun obtener(id: Int): T? {
        return if (id in lista.indices) lista[id] else null
    }

    override fun eliminar(id: Int) {
        if (id in lista.indices) lista.removeAt(id)
    }

    override fun tamano(): Int = lista.size
}

fun main() {
    val repoNombres = RepositorioMemoria<String>()
    repoNombres.agregar("Juan")
    repoNombres.agregar("Eduardo")
    println("Total nombres almacenados: ${repoNombres.tamano()}")
    println("Elemento en índice 0: ${repoNombres.obtener(0)}")
}
