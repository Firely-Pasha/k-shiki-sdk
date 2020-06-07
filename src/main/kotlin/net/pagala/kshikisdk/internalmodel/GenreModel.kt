package net.pagala.kshikisdk.internalmodel

import net.pagala.kshikisdk.model.Genre

internal data class GenreModel(
    override val id: Int,
    override val name: String,
    override val russian: String,
    override val kind: String
): Genre