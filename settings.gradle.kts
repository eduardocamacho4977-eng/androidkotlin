pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
    }
}

rootProject.name = "EjerciciosKotlin"

include(
    "ejercicio01-persona",
    "ejercicio02-automovil",
    "ejercicio03-animales",
    "ejercicio04-libros",
    "ejercicio05-reproducible",
    "ejercicio06-repositorio-generico",
    "ejercicio07-pato",
    "ejercicio08-dia-semana",
    "ejercicio09-moneda",
    "ejercicio10-nivel"
)
