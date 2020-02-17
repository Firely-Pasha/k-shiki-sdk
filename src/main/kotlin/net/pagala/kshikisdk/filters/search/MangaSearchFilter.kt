package net.pagala.kshikisdk.filters.search

import net.pagala.kshikisdk.enums.MangaKind
import net.pagala.kshikisdk.enums.MangaOrder

class MangaSearchFilter : TitleSearchFilter() {
    var order: MangaOrder? = null

    val kinds = CollectionParameter<MangaKind>()
    val publishers = CollectionParameter<Int>()
}