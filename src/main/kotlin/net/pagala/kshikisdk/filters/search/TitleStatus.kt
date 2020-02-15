package net.pagala.kshikisdk.filters.search

import com.squareup.moshi.Json

enum class TitleStatus {
    @Json(name = "anons")
    ANONS,
    @Json(name = "ongoing")
    ONGOING,
    @Json(name = "released")
    RELEASED;

    override fun toString() = name.toLowerCase()
}