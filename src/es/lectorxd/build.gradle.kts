plugins {
    id("com.android.library")
    kotlin("android")
    id("dev.zacsweers.moshix")
    id("com.google.devtools.ksp")
}

keiyoushi {
    name = "LectorXD"
    versionCode = 1
    contentWarning = ContentWarning.SAFE
    libVersion = "1.6"

    source {
        name = "LectorXD"
        lang = "es"
        baseUrl = "https://lectorxd.com"
    }
}