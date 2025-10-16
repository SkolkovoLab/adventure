plugins {
  alias(libs.plugins.indra.sonatype)
  alias(libs.plugins.nexusPublish)
  `maven-publish`
}
allprojects {
  apply(plugin = "maven-publish")
  publishing {
    repositories {
      maven {
        name = "cherry"
        url = uri("https://repo.cherry.pizza/repository/adventure-text-serializer-nbt/")
        credentials {
          username = "admin"
          password = "bottom_text"
        }
      }
    }
  }
}
