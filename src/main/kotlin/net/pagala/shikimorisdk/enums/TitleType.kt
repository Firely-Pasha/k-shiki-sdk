package net.pagala.shikimorisdk.enums

import com.squareup.moshi.Json

enum class TitleType {
    @Json(name = "anime")
    ANIME,
    @Json(name = "manga")
    MANGA,
    @Json(name = "ranobe")
    RANOBE
}