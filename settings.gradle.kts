rootProject.name = "sovereign-app"

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

// 1. App Runners
include(":apps:desktop")

// 2. Core Modules
include(":core:model")
include(":core:designsystem")
include(":core:common")

// 3. Service Modules
include(":services:docker")
include(":services:ssh")
include(":services:orchestration")

// 4. Feature Modules
include(":feature:dashboard")
include(":feature:console")
include(":feature:settings")