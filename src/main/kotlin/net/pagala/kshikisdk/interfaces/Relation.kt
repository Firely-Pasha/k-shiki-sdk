package net.pagala.kshikisdk.interfaces

import net.pagala.kshikisdk.model.AnimeModel
import net.pagala.kshikisdk.model.MangaModel

interface Relation {
    val relation: String
    val relationRussian: String
    val anime: AnimeModel?
    val manga: MangaModel?
}