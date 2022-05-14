import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.31"
}

group = "jpa-basic"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.hibernate:hibernate-entitymanager:5.3.10.Final")
    implementation("com.h2database:h2:2.1.210")
    implementation("javax.xml.bind:jaxb-api:2.3.0")

    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "11"
}