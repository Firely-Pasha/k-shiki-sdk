package net.pagala.shikimorisdk.model

import net.pagala.shikimorisdk.enums.AnimeKind

interface Anime : Title {
    val kind: AnimeKind?
    val episodes: Int
    val episodesAired: Int
}