import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.2.2.RELEASE"
	id("io.spring.dependency-management") version "1.0.8.RELEASE"
	kotlin("jvm") version "1.3.61"
	kotlin("plugin.spring") version "1.3.61"
	id("java-library")
}


group = "meeee"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

val developmentOnly by configurations.creating
configurations {
	runtimeClasspath {
		extendsFrom(developmentOnly)
	}
}

repositories {
	mavenCentral()
	jcenter()
	maven ("https://bnw-registry.simplybusiness.io/repository/sb-dna-maven-snapshot/")
	maven ("https://s3-us-west-2.amazonaws.com/dynamodb-local/release")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	testImplementation("org.springframework.boot:spring-boot-starter-test") {
		exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
	}

	implementation("com.simplybusiness.dna.common:dynamo:1.0.0-20200514.165556-3")

	// aws
//	implementation("com.amazonaws:aws-java-sdk-dynamodb:1.11.706")
//	implementation("com.amazonaws:aws-java-sdk-sts:1.11.634")
//	implementation("software.amazon.awssdk:aws-sdk-java:2.10.1")
//	implementation("com.amazonaws:DynamoDBLocal:1.11.477")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}
