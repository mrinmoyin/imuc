plugins {
    alias(libs.plugins.kotlin.jvm)

    application
}

repositories { mavenCentral() }

dependencies {
    // implementation(libs.guava)
    implementation("com.github.ajalt.clikt:clikt:5.0.3")
    implementation("com.github.ajalt.mordant:mordant:3.0.2")
    implementation("com.github.ajalt.mordant:mordant-coroutines:3.0.2")
}

java { toolchain { languageVersion = JavaLanguageVersion.of(17) } }

application { mainClass = "com.gitlab.mrinmoyin.imuc.MainKt" }

distributions { main { distributionBaseName.set("imuc") } }
