plugins {
    id("com.android.library")
    id("kotlin-android")
}

android {
    compileSdk = Versions.COMPILE_SDK_VERSION


    defaultConfig {
        minSdk = Versions.MIN_SDK_VERSION
        targetSdk = Versions.TARGET_SDK_VERSION

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