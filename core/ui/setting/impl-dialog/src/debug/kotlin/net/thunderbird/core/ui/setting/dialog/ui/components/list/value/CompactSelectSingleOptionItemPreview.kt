package net.thunderbird.core.ui.setting.dialog.ui.components.list.value

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import app.k9mail.core.ui.compose.designsystem.PreviewWithThemes
import net.thunderbird.core.ui.setting.dialog.ui.fake.FakeSettingData

@Composable
@Preview(showBackground = true)
internal fun PreferenceItemSingleChoiceViewPreview() {
    PreviewWithThemes {
        CompactSelectSingleOptionItem(
            setting = FakeSettingData.compactSelectSingleOption.copy(description = { null }),
            onSettingValueChange = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
internal fun PreferenceItemSingleChoiceViewWithDescriptionPreview() {
    PreviewWithThemes {
        CompactSelectSingleOptionItem(
            setting = FakeSettingData.compactSelectSingleOption,
            onSettingValueChange = {},
        )
    }
}
