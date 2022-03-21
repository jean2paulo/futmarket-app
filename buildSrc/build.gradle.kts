plugins {
    `java-gradle-plugin`
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    google()
}

object PluginsVersions {
    const val GRADLE_ANDROID = "4.2.1"
    const val KOTLIN = "1.6.0"
    const val NAVIGATION = "2.4.1"
}

dependencies {
    compileOnly(gradleApi())
    implementation("com.android.tools.build:gradle:${PluginsVersions.GRADLE_ANDROID}")
    implementation(kotlin("gradle-plugin", PluginsVersions.KOTLIN))
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:${PluginsVersions.NAVIGATION}")
}