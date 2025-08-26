plugins {
    java
    id("org.springframework.boot") version "3.5.5"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.dulfinne.randomgame"
version = "0.0.1-SNAPSHOT"
description = "random-game-config-server"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

repositories {
    mavenCentral()
}

extra["springCloudVersion"] = "2025.0.0"

dependencies {
    implementation("org.springframework.cloud:spring-cloud-config-server")
}

dependencyManagement {
    imports {
        mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
    }
}
