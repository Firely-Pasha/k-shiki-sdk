package net.pagala.shikimorisdk.internalmodel

import net.pagala.shikimorisdk.model.Image

internal data class ImageModel(
    override val original: String,
    override val preview: String,
    override val x96: String,
    override val x48: String
): Image