package net.pagala.shikimorisdk.internalmodel

import net.pagala.shikimorisdk.model.Genre

internal data class GenreModel(
    override val id: Int,
    override val name: String,
    override val russian: String,
    override val kind: String
): Genre