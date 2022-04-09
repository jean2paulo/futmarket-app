package dependencies

/**
 * Configuration version of all build dependencies
 */

object DependenciesVersions {
    const val LIFECYCLE = "2.2.0"
    const val KOTLIN = "1.6.0"
    const val CORE_KTX = "1.7.0"
    const val NAVIGATION = "2.4.1"
    const val CONSTRAIN_LAYOUT = "2.1.3"
    const val APPCOMPAT = "1.4.1"

    // Retrofit
    const val RETROFIT = "2.9.0"
    const val OKHTTP_LOGGING = "4.9.0"
}

/**
 * Project test dependencies, makes it easy to include external binaries or
 * other library modules to build.
 */

object Dependencies {
    const val LIFECYCLE_EXTENSIONS = "androidx.lifecycle:lifecycle-extensions:${DependenciesVersions.LIFECYCLE}"
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${DependenciesVersions.KOTLIN}"
    const val CORE_KTX = "androidx.core:core-ktx:${DependenciesVersions.CORE_KTX}"

    //Navigation - //REF: https://developer.android.com/jetpack/androidx/releases/navigation#declaring_dependencies
    const val NAVIGATION_FRAGMENT = "androidx.navigation:navigation-fragment-ktx:${DependenciesVersions.NAVIGATION}"
    const val NAVIGATION_UI = "androidx.navigation:navigation-ui-ktx:${DependenciesVersions.NAVIGATION}"
    const val NAVIGATION_DYNAMIC_FRAGMENT = "androidx.navigation:navigation-dynamic-features-fragment:${DependenciesVersions.NAVIGATION}"

    const val CONSTRAIN_LAYOUT = "androidx.constraintlayout:constraintlayout:${DependenciesVersions.CONSTRAIN_LAYOUT}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${DependenciesVersions.APPCOMPAT}"

    //Retrofit
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${DependenciesVersions.RETROFIT}"
    const val RETROFIT_CONVERTER = "com.squareup.retrofit2:converter-gson:${DependenciesVersions.RETROFIT}"
    const val OKHTTP_LOGGING = "com.squareup.okhttp3:logging-interceptor:${DependenciesVersions.OKHTTP_LOGGING}"

}