package net.pagala.shikimorisdk.model

interface MangaInfo : TitleInfo, Manga {
    val publishers: List<Publisher>
}