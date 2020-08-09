@file:Suppress("ArrayInDataClass")

package net.pagala.shikimorisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.shikimorisdk.model.Role

internal data class RoleModel(
    override val roles: Array<String>,
    @Json(name = "roles_russian")
    override val rolesRussian: Array<String>,
    override val character: CharacterModel?,
    override val person: CharacterModel?
): Role
