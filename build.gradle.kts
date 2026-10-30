plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.ksp)
}
android {
    namespace = "com.queen.assistant"
    compileSdk = 34
    defaultConfig {
        applicationId = "com.queen.assistant"
        minSdk = 28
        targetSdk = 34
        versionCode = 300
        versionName = "3.0.0"
    }
}