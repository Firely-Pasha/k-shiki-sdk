package net.pagala.kshikisdk.interfaces

interface MangaInfo : TitleInfo, Manga {
    val publishers: List<Publisher>
}