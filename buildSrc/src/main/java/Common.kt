object Common {

    object Android {

        object X {

            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
            const val constraintLayoutCompose =
                "androidx.constraintlayout:constraintlayout-compose:1.0.0"

            object Compose {
                const val version = "1.1.0"
                const val material = "androidx.compose.material:material:$version"
                const val tooling = "androidx.compose.ui:ui-tooling:$version"
            }

        }

    }

    object Coil {
        const val compose = "io.coil-kt:coil-compose:1.4.0"
    }

    object Accompanist {
        private const val version = "0.23.0"
        const val flowLayout = "com.google.accompanist:accompanist-flowlayout:$version"
        const val insetsUi = "com.google.accompanist:accompanist-insets-ui:$version"
    }

}
