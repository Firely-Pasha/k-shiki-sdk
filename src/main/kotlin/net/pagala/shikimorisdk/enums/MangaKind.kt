package net.pagala.shikimorisdk.enums

import com.squareup.moshi.Json

enum class MangaKind {
    @Json(name = "manga")
    MANGA,
    @Json(name = "manhwa")
    MANHWA,
    @Json(name = "manhua")
    MANHUA,
    @Json(name = "novel")
    NOVEL,
    @Json(name = "one_shot")
    ONE_SHOT,
    @Json(name = "doujin")
    DOUJIN;

    override fun toString(): String {
        return name.toLowerCase()
    }

}