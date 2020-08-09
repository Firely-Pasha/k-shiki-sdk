package net.pagala.shikimorisdk.model

import net.pagala.shikimorisdk.enums.MangaKind

interface Manga : Title {
    val kind: MangaKind
    val volumes: Int
    val chapters: Int
}