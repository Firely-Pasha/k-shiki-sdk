package net.pagala.kshikisdk.model.anime

import com.squareup.moshi.JsonClass

data class AnimeModel(
    override val id: Int,
    override val name: String
) : Anime