// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.3")
    }
}

plugins {
    id("com.android.application") version "7.1.3" apply false
    id("com.android.library") version "7.1.3" apply false
    kotlin("android") version "1.6.21" apply false
    id("io.gitlab.arturbosch.detekt") version "1.20.0"
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}