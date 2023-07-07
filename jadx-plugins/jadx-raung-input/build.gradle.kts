plugins {
	id("jadx-library")
}

dependencies {
	api(project(":jadx-core"))

	implementation(project(":jadx-plugins:jadx-java-input"))

	implementation("io.github.skylot:raung-asm:0.1.0")
}
