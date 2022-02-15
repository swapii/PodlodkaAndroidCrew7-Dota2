plugins {
    id("com.android.application")
    kotlin("android")
}

android {

    defaultConfig {
        applicationId = "podlodka.crew.android.seven.dota"
        namespace = "podlodka.crew.android.seven.dota"
    }

    buildFeatures {
        compose = true
    }

}

dependencies {

    implementation(Common.Android.X.activityCompose)
    implementation(Common.Android.X.Compose.material)

    implementation("io.coil-kt:coil-compose:1.4.0")

}
