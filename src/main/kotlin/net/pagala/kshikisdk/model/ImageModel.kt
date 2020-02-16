package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.interfaces.Image

class ImageModel(
    override val original: String,
    override val preview: String,
    override val x96: String,
    override val x48: String
): Image