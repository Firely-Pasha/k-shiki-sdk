package net.pagala.shikimorisdk.internalmodel

import net.pagala.shikimorisdk.model.Screenshot

internal data class ScreenshotModel(
    override val original: String,
    override val preview: String
): Screenshot