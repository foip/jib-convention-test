plugins {
    kotlin("jvm") version "1.9.22"
    application

    id("jib-convention")
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

application {
    mainClass = "MainKt"
}

jib {
    to {
        image = "hello-world"
    }
}
