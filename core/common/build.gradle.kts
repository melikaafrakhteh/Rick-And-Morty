plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.melika.rickandmorty.core.common"
}

dependencies {

    implementation(libs.kotlinx.coroutines.android)
}