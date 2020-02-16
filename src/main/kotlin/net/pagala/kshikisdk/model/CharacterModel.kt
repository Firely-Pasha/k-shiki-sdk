package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.interfaces.Character

data class CharacterModel(
    override val id: Int,
    override val name: String,
    override val russian: String?,
    override val image: ImageModel,
    override val url: String
): Character