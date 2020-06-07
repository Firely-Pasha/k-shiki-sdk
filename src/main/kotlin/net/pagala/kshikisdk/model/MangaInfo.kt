package net.pagala.kshikisdk.model

interface MangaInfo : TitleInfo, Manga {
    val publishers: List<Publisher>
}