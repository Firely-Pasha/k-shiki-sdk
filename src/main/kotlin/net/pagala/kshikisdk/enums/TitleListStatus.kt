package net.pagala.kshikisdk.enums

import com.squareup.moshi.Json

enum class TitleListStatus {
    @Json(name = "planned")
    PLANNED,
    @Json(name = "watching")
    WATCHING,
    @Json(name = "rewatching")
    REWATCHING,
    @Json(name = "completed")
    COMPLETED,
    @Json(name = "on_hold")
    ON_HOLD,
    @Json(name = "dropped")
    DROPPED;

    override fun toString(): String {
        return name.toLowerCase()
    }
}
