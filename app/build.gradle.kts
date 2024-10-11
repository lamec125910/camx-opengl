plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.lang.camrenderx"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.lang.camrenderx"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.6")
    implementation("androidx.activity:activity-compose:1.9.2")
    implementation(platform("androidx.compose:compose-bom:2023.03.00"))

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.1")



    // Compose
    val composeUIVersion = "1.7.3"
    implementation("androidx.compose.ui:ui:${composeUIVersion}")
    implementation("androidx.compose.ui:ui-graphics:${composeUIVersion}")
    implementation("androidx.compose.ui:ui-tooling-preview:${composeUIVersion}")
    implementation("androidx.compose.material3:material3:1.3.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${composeUIVersion}")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.03.00"))
    debugImplementation("androidx.compose.ui:ui-tooling:${composeUIVersion}")
    debugImplementation("androidx.compose.ui:ui-test-manifest:${composeUIVersion}")

    // CameraX
    val cameraxVersion = "1.3.4"
    implementation ("androidx.camera:camera-core:$cameraxVersion")
    implementation ("androidx.camera:camera-camera2:$cameraxVersion")
    implementation ("androidx.camera:camera-lifecycle:$cameraxVersion")
    implementation ("androidx.camera:camera-view:1.3.4")

    implementation ("com.google.android.material:material:1.12.0")

}