plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
}

dependencies {
    implementation("gradle.plugin.com.google.cloud.tools:jib-gradle-plugin:3.2.1")
    implementation("com.google.cloud.tools:jib-ownership-extension-gradle:0.1.0")
}
