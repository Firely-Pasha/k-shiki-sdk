package net.pagala.shikimorisdk.internalmodel

import net.pagala.shikimorisdk.model.PersonWork

internal data class PersonWorkModel(
    override val anime: AnimeModel?,
    override val manga: MangaModel?,
    override val role: String
) : PersonWork