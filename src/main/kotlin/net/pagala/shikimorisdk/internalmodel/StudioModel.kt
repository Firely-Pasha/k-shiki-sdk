package net.pagala.shikimorisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.shikimorisdk.model.Studio

internal data class StudioModel(
    override val id: Int,
    override val name: String,
    @Json(name = "filtered_name")
    override val filteredName: String,
    override val real: Boolean,
    override val image: String?
): Studio