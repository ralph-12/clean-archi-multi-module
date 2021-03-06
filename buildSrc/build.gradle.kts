plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenCentral()
}

dependencies {
    /* hard cording area */
    implementation("com.android.tools.build:gradle:7.0.4")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.10")
    implementation("com.squareup:javapoet:1.13.0")
}
