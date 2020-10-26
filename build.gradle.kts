import org.jlleitschuh.gradle.ktlint.reporter.ReporterType
import java.net.URI

buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(Deps.gradlePlugin)
        classpath(Deps.Plugins.androidMaven)
        classpath(kotlin(Deps.Kotlin.gradlePlugin, Versions.kotlin))
        classpath(Deps.Plugins.bintray)
        classpath(Deps.Plugins.dokka)
    }
}

plugins {
    idea
    id (Deps.Plugins.ktlint) version Versions.ktlint
    id (Deps.Plugins.arkikekt) version Versions.arkikekt
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven { url = URI("https://jitpack.io") }
    }
}

subprojects {
    apply(plugin = Deps.Plugins.ktlint)

    ktlint {
        version.set(Versions.ktlintExtension)
        ignoreFailures.set(true)
        android.set(true)
        outputToConsole.set(true)
        reporters.set(setOf(ReporterType.PLAIN, ReporterType.CHECKSTYLE))
    }
}
