package net.pagala.kshikisdk.interfaces

import net.pagala.kshikisdk.enums.AnimeKind

interface Anime : Title {
    val kind: AnimeKind
    val episodes: Int
    val episodesAired: Int
}