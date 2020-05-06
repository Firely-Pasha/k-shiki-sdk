package net.pagala.kshikisdk.model

import com.squareup.moshi.Json
import net.pagala.kshikisdk.interfaces.Relation

data class RelationModel(
    override val relation: String,
    @Json(name = "relation_russian")
    override val relationRussian: String,
    override val anime: AnimeModel?,
    override val manga: MangaModel?
) : Relation