package net.pagala.kshikisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.kshikisdk.model.Relation

internal data class RelationModel(
    override val relation: String,
    @Json(name = "relation_russian")
    override val relationRussian: String,
    override val anime: AnimeModel?,
    override val manga: MangaModel?
) : Relation