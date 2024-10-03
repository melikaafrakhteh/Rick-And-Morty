plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.melika.rickandmorty.core.model"
}

dependencies {
    implementation(libs.androidx.core.ktx)
}