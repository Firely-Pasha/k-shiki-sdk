package net.pagala.kshikisdk.internalmodel

import net.pagala.kshikisdk.model.Image

internal data class ImageModel(
    override val original: String,
    override val preview: String,
    override val x96: String,
    override val x48: String
): Image