package net.pagala.kshikisdk.interfaces

import com.squareup.moshi.Json

interface Role {
    val roles: Array<String>
    @Json(name = "roles_russian")
    val rolesRussian: Array<String>
    val character: Character?
    val person: Character?
}