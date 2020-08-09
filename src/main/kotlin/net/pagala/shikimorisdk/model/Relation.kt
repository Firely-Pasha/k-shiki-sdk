package net.pagala.shikimorisdk.model

interface Relation {
    val relation: String
    val relationRussian: String
    val anime: Anime?
    val manga: Manga?
}