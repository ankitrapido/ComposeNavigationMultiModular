apply {
    from("$rootDir/base-module.gradle")
}

plugins {
    id("com.google.devtools.ksp") version "1.6.10-1.0.2"
}

ksp {
    arg("compose-destinations.mode", "destinations")
    arg("compose-destinations.moduleName", "listings")
}

dependencies {
    "ksp"(Compose.composeDestinationsKsp)
}