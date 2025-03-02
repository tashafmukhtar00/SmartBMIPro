plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.tashyappshub.smartbmipro"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.tashyappshub.smartbmipro"
        minSdk = 28
        targetSdk = 35
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    // Coil - Lightweight image loading library for Kotlin
    implementation("io.coil-kt:coil:2.4.0")
    // Timber - Logging library for better debugging
    implementation("com.jakewharton.timber:timber:5.0.1")
    // Toasty - Customizable Toast messages with different styles
    implementation("com.github.GrenderG:Toasty:1.5.2")
    // Koin - Dependency Injection for Kotlin
    implementation("io.insert-koin:koin-android:3.5.0")
    implementation("io.insert-koin:koin-core:3.5.0")
    // Lottie - For smooth and lightweight animations
    implementation("com.airbnb.android:lottie:6.1.0")

    // Coroutines - Asynchronous programming for better performance
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")

    // ViewModel - MVVM architecture component
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")

    // LiveData - Reactive UI updates
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")

    // Navigation Component - Simplified navigation between screens
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")

    // Room - Local database storage for BMI history
//    implementation("androidx.room:room-runtime:2.5.2")
//    kapt("androidx.room:room-compiler:2.5.2")

    // DataStore - SharedPreferences replacement for lightweight data storage
    implementation("androidx.datastore:datastore-preferences:1.0.0")


    // Navigation Component
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")


}