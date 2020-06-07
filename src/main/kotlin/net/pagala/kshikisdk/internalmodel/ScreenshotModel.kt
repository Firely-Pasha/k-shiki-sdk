package net.pagala.kshikisdk.internalmodel

import net.pagala.kshikisdk.model.Screenshot

internal data class ScreenshotModel(
    override val original: String,
    override val preview: String
): Screenshot