apply {
    from("$rootDir/base-module.gradle")
}

plugins {
    id("com.google.devtools.ksp") version "1.6.10-1.0.2"
}

ksp {
    arg("compose-destinations.mode", "navgraphs")
    arg("compose-destinations.moduleName", "home")
}

dependencies {
    "ksp"(Compose.composeDestinationsKsp)
}