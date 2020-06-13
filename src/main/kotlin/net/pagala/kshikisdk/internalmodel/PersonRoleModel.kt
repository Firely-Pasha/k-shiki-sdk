package net.pagala.kshikisdk.internalmodel

import net.pagala.kshikisdk.model.PersonRole

internal data class PersonRoleModel(
    override val characters: List<CharacterModel>,
    override val animes: List<AnimeModel>
) : PersonRole