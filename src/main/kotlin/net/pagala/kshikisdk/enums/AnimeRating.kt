package net.pagala.kshikisdk.enums

import com.squareup.moshi.Json

enum class AnimeRating {
    @Json(name = "none")
    NONE,
    @Json(name = "g")
    G,
    @Json(name = "pg")
    PG,
    @Json(name = "pg_13")
    PG_13,
    @Json(name = "r")
    R,
    @Json(name = "r_plus")
    R_PLUS,
    @Json(name = "rx")
    RX;

    override fun toString(): String {
        return name.toLowerCase()
    }
}