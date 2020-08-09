package net.pagala.shikimorisdk.internalmodel

import net.pagala.shikimorisdk.model.PersonRole

internal data class PersonRoleModel(
    override val characters: List<CharacterModel>,
    override val animes: List<AnimeModel>
) : PersonRole