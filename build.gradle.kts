plugins {
    kotlin("jvm") version "1.9.20"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

    implementation("org.mongodb:mongodb-driver-kotlin-coroutine:4.10.1")

    implementation("com.github.auties00:whatsappweb4j:3.5.1")
}
