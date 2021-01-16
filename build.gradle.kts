// For Jdk 10+, use at least Jersey v2.27
val jerseyVersion = "2.33" // Dec 2020

plugins {
	id("java")
    war
}

group = "org.pensatocode.sample"
version = "0.1.0"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
    jcenter()
}

dependencies {
    // Jersey libs
    implementation("org.glassfish.jersey.containers:jersey-container-servlet:${jerseyVersion}")
    implementation("org.glassfish.jersey.inject:jersey-hk2:${jerseyVersion}")
    implementation("org.glassfish.jersey.media:jersey-media-json-jackson:${jerseyVersion}")
}

tasks.war {
    from("src/main/resources/index.html")
    archiveFileName.set("jersey-app.war")
}