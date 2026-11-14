plugins {
    id("com.android.application")
}

android {
    namespace = "com.hogan.orangepulse"
    compileSdk = 35
    buildToolsVersion = "35.0.0"

    defaultConfig {
        applicationId = "com.hogan.orangepulse"
        minSdk = 33
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        debug {
            // Remove the unused generated R classes from this resource-only APK.
            isMinifyEnabled = true
        }
    }
}
