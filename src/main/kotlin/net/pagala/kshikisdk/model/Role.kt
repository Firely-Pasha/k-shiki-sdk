@file:Suppress("ArrayInDataClass")

package net.pagala.kshikisdk.model

import com.squareup.moshi.Json

data class Role(
    val roles: Array<String>,
    @Json(name = "roles_russian")
    val rolesRussian: Array<String>,
    val character: Character?,
    val person: Character?
)
