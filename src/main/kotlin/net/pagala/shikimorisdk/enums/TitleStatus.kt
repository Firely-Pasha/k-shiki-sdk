package net.pagala.shikimorisdk.enums

import com.squareup.moshi.Json

enum class TitleStatus {
    @Json(name = "anons")
    ANONS,
    @Json(name = "ongoing")
    ONGOING,
    @Json(name = "released")
    RELEASED,
    @Json(name = "paused")
    PAUSED;


    override fun toString() = name.toLowerCase()
}