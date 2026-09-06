plugins {
    id("com.android.application") version "8.7.3"
    id("org.jetbrains.kotlin.android") version "2.0.21"
}

android {
    namespace = "com.sansu.aiforexbot"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.sansu.aiforexbot"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
