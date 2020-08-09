package net.pagala.shikimorisdk.internalmodel

import net.pagala.shikimorisdk.model.Character

internal data class CharacterModel(
    override val id: Int,
    override val name: String,
    override val russian: String?,
    override val image: ImageModel,
    override val url: String
): Character