package sample

import org.gradle.api.*

class InfoPlugin implements Plugin<Project> {
  void apply(Project project) {
    // Add the Java Bean InfoPluginExtension with the
    // name info to the project ExtensionContainer.
    project.extensions.create('info', InfoPluginExtension)

    project.task('info') << {
      // Use project.info.preifx from the extension.
      println "$project.info.prefix: $project.gradle.gradleVersion"
    }
  }
}

