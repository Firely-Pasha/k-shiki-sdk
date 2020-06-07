package net.pagala.kshikisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.kshikisdk.enums.AnimeKind
import net.pagala.kshikisdk.enums.TitleStatus
import net.pagala.kshikisdk.model.AnimeWithRole

internal data class AnimeWithRoleModel(
    override val id: Int,
    override val name: String,
    override val russian: String?,
    override val image: ImageModel,
    override val url: String,

    @Json(name = "aired_on")
    override val airedOn: String?,
    @Json(name = "released_on")
    override val releasedOn: String?,
    override val status: TitleStatus,

    override val kind: AnimeKind,
    override val episodes: Int,
    @Json(name = "episodes_aired")
    override val episodesAired: Int,

    override val role: String
) : AnimeWithRole