package net.pagala.kshikisdk.model

import com.squareup.moshi.Json
import net.pagala.kshikisdk.interfaces.Studio

data class StudioModel(
    override val id: Int,
    override val name: String,
    @Json(name = "filtered_name")
    override val filteredName: String,
    override val real: Boolean,
    override val image: String?
): Studio