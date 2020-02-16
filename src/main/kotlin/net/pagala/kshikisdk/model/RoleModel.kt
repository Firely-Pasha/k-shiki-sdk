@file:Suppress("ArrayInDataClass")

package net.pagala.kshikisdk.model

import com.squareup.moshi.Json
import net.pagala.kshikisdk.interfaces.Role

data class RoleModel(
    override val roles: Array<String>,
    @Json(name = "roles_russian")
    override val rolesRussian: Array<String>,
    override val character: CharacterModel?,
    override val person: CharacterModel?
): Role
