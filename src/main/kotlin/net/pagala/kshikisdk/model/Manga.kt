package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.enums.MangaKind

interface Manga : Title {
    val kind: MangaKind
    val volumes: Int
    val chapters: Int
}