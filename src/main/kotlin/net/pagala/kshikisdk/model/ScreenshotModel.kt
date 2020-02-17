package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.interfaces.Screenshot

data class ScreenshotModel(
    override val original: String,
    override val preview: String
): Screenshot