package net.pagala.kshikisdk.internalmodel

import net.pagala.kshikisdk.model.PersonWork

internal data class PersonWorkModel(
    override val anime: AnimeModel?,
    override val manga: MangaModel?,
    override val role: String
) : PersonWork