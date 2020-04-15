package net.pagala.kshikisdk.model

import com.squareup.moshi.Json
import net.pagala.kshikisdk.enums.MangaKind
import net.pagala.kshikisdk.enums.TitleStatus
import net.pagala.kshikisdk.interfaces.Manga

data class MangaModel(
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

    override val kind: MangaKind,
    override val volumes: Int,
    override val chapters: Int
) : Manga