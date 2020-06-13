package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.enums.AnimeKind

interface Anime : Title {
    val kind: AnimeKind?
    val episodes: Int
    val episodesAired: Int
}