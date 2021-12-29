object Libs {
    object Android {
        const val MATERIAL = "com.google.android.material:material:1.4.0"
        const val CORE_KTX = "androidx.core:core-ktx:1.7.0"
        const val APP_COMPAT = "androidx.appcompat:appcompat:1.4.0"
        const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:2.1.2"
        const val FRAGMENT = "androidx.fragment:fragment-ktx:1.4.0"
        const val ACTIVITY = "androidx.activity:activity-ktx:1.4.0"

        object Lifecycle {
            private const val VERSION = "2.3.0"
            const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-ktx:$VERSION"
            const val LIVE_DATA = "androidx.lifecycle:lifecycle-livedata-ktx:$VERSION"
        }

        object Navigation {
            private const val VERSION = "2.3.1"
            const val UI = "androidx.navigation:navigation-ui-ktx:$VERSION"
            const val FRAGMENT = "androidx.navigation:navigation-fragment-ktx:$VERSION"
        }

        object COMPOSE {
            private const val VERSION = "1.0.5"
            const val ACTIVITY = "androidx.activity:activity-compose:1.3.1"
            const val MATERIAL = "androidx.compose.material:material:$VERSION"
            const val ANIMATION = "androidx.compose.animation:animation:$VERSION"
            const val UI_TOOL = "androidx.compose.ui:ui-tooling:$VERSION"
            const val VIEW_MODEL = "androidx.lifecycle:lifecycle-viewmodel-compose:1.0.0-alpha07"
            const val MATERIAL_THEME = "com.google.android.material:compose-theme-adapter:$VERSION"
        }
    }

    object GSON {
        const val GSON = "com.google.code.gson:gson:2.8.9"
    }
}