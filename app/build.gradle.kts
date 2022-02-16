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
    implementation(Common.Android.X.constraintLayoutCompose)
    implementation(Common.Android.X.Compose.material)
    implementation(Common.Android.X.Compose.tooling)

    implementation(Common.Coil.compose)

    implementation(Common.Accompanist.flowLayout)
    implementation(Common.Accompanist.insetsUi)

}
