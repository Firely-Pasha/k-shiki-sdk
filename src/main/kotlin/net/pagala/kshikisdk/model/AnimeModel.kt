package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.interfaces.Anime

data class AnimeModel(
    override val id: Int,
    override val name: String
) : Anime