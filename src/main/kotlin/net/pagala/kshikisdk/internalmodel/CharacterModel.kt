package net.pagala.kshikisdk.internalmodel

import net.pagala.kshikisdk.model.Character

internal data class CharacterModel(
    override val id: Int,
    override val name: String,
    override val russian: String?,
    override val image: ImageModel,
    override val url: String
): Character