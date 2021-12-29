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
    }
}