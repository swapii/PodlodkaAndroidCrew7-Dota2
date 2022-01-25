plugins {
    id("com.android.application") version "7.0.4" apply false
    id("org.jetbrains.kotlin.android") version "1.6.10" apply false
}

subprojects {

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            jvmTarget = JavaVersion.VERSION_1_8.toString()
        }
    }

    plugins.apply {

        withType<com.android.build.gradle.internal.plugins.BasePlugin<*, *, *>> {

            configure<com.android.build.gradle.BaseExtension> {

                compileSdkVersion(31)
                buildToolsVersion("31.0.0")

                defaultConfig {
                    minSdk = 26
                    targetSdk = 31
                }

                compileOptions {
                    sourceCompatibility = JavaVersion.VERSION_1_8
                    targetCompatibility = JavaVersion.VERSION_1_8
                }

            }

        }

    }

}
