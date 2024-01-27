plugins {
    id("com.google.cloud.tools.jib")
}

jib {
    pluginExtensions {
        pluginExtension {
            implementation = "com.google.cloud.tools.jib.gradle.extension.ownership.JibOwnershipExtension"

            configuration(Action<com.google.cloud.tools.jib.gradle.extension.ownership.Configuration> {
                rules {
                    // Whatever ...
                }
            })
        }
    }
}