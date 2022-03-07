import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
    id("org.jlleitschuh.gradle.ktlint") version "10.0.0"
    jacoco
}

group = "me.ibrizuela"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

jacoco {
    toolVersion = "0.8.7"
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
    reports {
        xml.isEnabled = true
    }
}