plugins {
    kotlin("jvm") version "2.0.20" apply false
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "application")

    extensions.configure<org.jetbrains.kotlin.gradle.dsl.KotlinJvmProjectExtension> {
        compilerOptions.jvmTarget.set(org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_17)
        sourceSets.getByName("main").kotlin.setSrcDirs(listOf("src/main/java"))
    }

    extensions.configure<org.gradle.api.plugins.JavaPluginExtension> {
        sourceCompatibility = org.gradle.api.JavaVersion.VERSION_17
        targetCompatibility = org.gradle.api.JavaVersion.VERSION_17
    }

    extensions.configure<org.gradle.api.plugins.JavaApplication> {
        mainClass.set("com.example.${project.name.substringBefore('-')}.MainKt")
    }

    tasks.withType<org.gradle.api.tasks.JavaExec>().configureEach {
        standardInput = System.`in`
    }
}
