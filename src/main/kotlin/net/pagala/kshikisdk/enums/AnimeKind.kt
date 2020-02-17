package net.pagala.kshikisdk.enums

import com.squareup.moshi.Json

enum class AnimeKind {
    @Json(name = "tv")
    TV,
    @Json(name = "movie")
    MOVIE,
    @Json(name = "ova")
    OVA,
    @Json(name = "ona")
    ONA,
    @Json(name = "special")
    SPECIAL,
    @Json(name = "music")
    MUSIC;

    override fun toString(): String {
        return name.toLowerCase()
    }
}
