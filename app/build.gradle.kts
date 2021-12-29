plugins {
    id ("com.android.application")
    kotlin("android")
}

android {
    compileSdk = 31

    defaultConfig {
        applicationId = "com.application.jimu"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"

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
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
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

    //TODO Clean up
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}