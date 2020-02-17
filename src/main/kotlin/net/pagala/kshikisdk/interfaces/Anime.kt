package net.pagala.kshikisdk.interfaces

import com.squareup.moshi.JsonClass
import net.pagala.kshikisdk.filters.search.AnimeKind
import net.pagala.kshikisdk.filters.search.TitleStatus

interface Anime : Title {
    val kind: AnimeKind
    val episodes: Int
    val episodesAired: Int
}