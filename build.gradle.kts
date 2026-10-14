// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    // Safe Args: generates classes for passing data between screens
    id("androidx.navigation.safeargs.kotlin") version "2.9.8" apply false
}

val userHome = System.getProperty("user.home")
val buildCacheDir = file("$userHome/.gradle_builds/TenantManagementSystem")

layout.buildDirectory.set(file("$buildCacheDir/root"))
subprojects {
    layout.buildDirectory.set(file("$buildCacheDir/${project.name}"))
}