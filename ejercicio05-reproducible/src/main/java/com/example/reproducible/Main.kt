package com.example.reproducible

interface Reproducible {
    fun play()
    fun pause()
}

class Cancion(val titulo: String, val artista: String) : Reproducible {
    override fun play() {
        println("▶ Reproduciendo la canción: '$titulo' de $artista")
    }
    override fun pause() {
        println("⏸ Canción pausada: '$titulo'")
    }
}

class Video(val titulo: String, val duracionMinutos: Int) : Reproducible {
    override fun play() {
        println("▶ Reproduciendo video: '$titulo' ($duracionMinutos min)")
    }
    override fun pause() {
        println("⏸ Video pausado: '$titulo'")
    }
}

fun main() {
    val medios: List<Reproducible> = listOf(
        Cancion("Starboy", "The Weeknd"),
        Video("Tutorial de Kotlin & Android", 45)
    )

    for (medio in medios) {
        medio.play()
        medio.pause()
    }
}
