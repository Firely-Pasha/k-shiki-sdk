package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.interfaces.Genre

data class GenreModel(
    override val id: Int,
    override val name: String,
    override val russian: String,
    override val kind: String
): Genre