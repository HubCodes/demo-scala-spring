buildscript {
    dependencies {
        classpath("org.scala-lang:scala-library:2.13.6")
        classpath("gradle.plugin.com.github.maiflai:gradle-scalatest:0.31")
    }
}

plugins {
    id("org.springframework.boot") version "2.5.3"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    java
    scala
    id("com.github.maiflai.scalatest") version "0.31"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.scala-lang:scala-library:2.13.6")
    implementation("dev.miku:r2dbc-mysql:0.8.2.RELEASE")
    implementation("org.springframework.boot:spring-boot-starter-data-r2dbc")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("org.springframework.boot:spring-boot-starter-json")
    implementation("com.fasterxml.jackson.module:jackson-module-scala_2.13:2.12.4")
    implementation("com.h2database:h2")

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.jupiter", module = "junit-jupiter")
    }
    testImplementation("junit:junit")
    testImplementation("org.mockito:mockito-core")
    testImplementation("org.scalacheck:scalacheck_2.13:1.15.2")
    testImplementation("org.scalatest:scalatest_2.13:3.2.9")
    testImplementation("org.scalatestplus:scalatestplus-mockito_2.13:1.0.0-M2")
    testImplementation("org.scalatestplus:junit-4-13_2.13:3.2.9.0")

    testImplementation("com.h2database:h2")
    testImplementation("io.projectreactor:reactor-test")
}

tasks {
    test {
        testLogging.showExceptions = true
        useJUnitPlatform()
    }
}
