package net.pagala.kshikisdk.model

import com.squareup.moshi.Json
import net.pagala.kshikisdk.filters.search.AnimeKind
import net.pagala.kshikisdk.filters.search.TitleStatus
import net.pagala.kshikisdk.interfaces.Anime
import net.pagala.kshikisdk.interfaces.Image

data class AnimeModel(
    override val id: Int,
    override val name: String,
    override val russian: String,
    override val image: ImageModel,
    override val url: String,
    @Json(name = "aired_on")
    override val airedOn: String,
    @Json(name = "released_on")
    override val releasedOn: String,
    override val status: TitleStatus,
    override val kind: AnimeKind,
    override val episodes: Int,
    @Json(name = "episodes_aired")
    override val episodesAired: Int
) : Anime