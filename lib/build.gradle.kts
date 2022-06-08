plugins {
    `java-library`

    id("com.diffplug.spotless") version "6.7.0"
    id("net.ltgt.errorprone") version "2.0.2"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    errorprone("com.google.errorprone:error_prone_core:2.14.0")
}

tasks.test {
    useJUnitPlatform()
}

spotless {
    encoding("UTF-8")

    java {
        googleJavaFormat("1.15.0")
    }

    kotlinGradle {
        ktlint()
    }
}
