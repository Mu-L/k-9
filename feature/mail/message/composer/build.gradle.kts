plugins {
    id(ThunderbirdPlugins.Library.androidCompose)
    alias(libs.plugins.dev.mokkery)
}

android {
    namespace = "net.thunderbird.feature.mail.message.composer"
}

dependencies {
    implementation(projects.core.ui.compose.designsystem)
    implementation(projects.core.ui.theme.api)
    implementation(projects.feature.notification.api)
}
