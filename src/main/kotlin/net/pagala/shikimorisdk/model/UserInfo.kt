package net.pagala.shikimorisdk.model

import com.squareup.moshi.Json

interface UserInfo: UserMore {
    @Json(name = "full_years")
    val fullYears: Int?
    @Json(name = "last_online")
    val lastOnline: String
    @Json(name = "location")
    val location: String?
}