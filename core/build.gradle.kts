import dependencies.Dependencies
import extensions.implementation
import java.util.Properties

plugins {
    id(BuildPlugins.COMMONS_ANDROID_LIBRARY)
}

android {

    buildTypes.forEach {
        try {
            val properties = Properties().apply {
                load(rootProject.file("local.properties").reader())
            }

            it.buildConfigField("String", "RAPID_API_HOST", properties["RapidApi.host"] as String)
            it.buildConfigField("String","RAPID_API_KEY", properties["RapidApi.key"] as String)

        } catch (ignored: Exception) {
            throw InvalidUserDataException("You should define 'RapidApi.host' and " +
                    "'RapidApi.key' in local.properties. Visit 'https://rapidapi.com/apidojo/api/transfermarket/' " +
                    "to obtain them.")
        }
    }
}

dependencies {
    implementation(Dependencies.CORE_KTX)

    implementation(Dependencies.LIFECYCLE_EXTENSIONS)
}