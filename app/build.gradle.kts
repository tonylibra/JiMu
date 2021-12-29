plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    compileSdk = Versions.COMPILE_SDK_VERSION

    defaultConfig {
        applicationId = "com.application.jimu"
        minSdk = Versions.MIN_SDK_VERSION
        targetSdk = Versions.TARGET_SDK_VERSION
        versionCode = Versions.VERSION_CODE
        versionName = Versions.VERSION_NAME

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    buildFeatures {
        viewBinding = true
        compose = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Versions.COMPOSE_VERSION
    }
}

dependencies {
    //ANDROID
    implementation(Libs.Android.MATERIAL)
    implementation(Libs.Android.ACTIVITY)
    implementation(Libs.Android.APP_COMPAT)
    implementation(Libs.Android.CONSTRAINT_LAYOUT)
    implementation(Libs.Android.CORE_KTX)
    implementation(Libs.Android.FRAGMENT)
    implementation(Libs.Android.Navigation.FRAGMENT)
    implementation(Libs.Android.Navigation.UI)
    implementation(Libs.Android.Lifecycle.LIVE_DATA)
    implementation(Libs.Android.Lifecycle.VIEW_MODEL)
    implementation(Libs.Android.COMPOSE.ACTIVITY)
    implementation(Libs.Android.COMPOSE.MATERIAL)
    implementation(Libs.Android.COMPOSE.MATERIAL_THEME)
    implementation(Libs.Android.COMPOSE.ANIMATION)
    implementation(Libs.Android.COMPOSE.UI_TOOL)
    implementation(Libs.Android.COMPOSE.VIEW_MODEL)

    //GSON
    implementation(Libs.GSON.GSON)

    //TODO Clean up
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}