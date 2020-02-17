package net.pagala.kshikisdk.filters.search

import net.pagala.kshikisdk.enums.AnimeKind
import net.pagala.kshikisdk.enums.AnimeOrder
import net.pagala.kshikisdk.enums.AnimeRating
import net.pagala.kshikisdk.enums.Duration

class AnimeSearchFilter : TitleSearchFilter() {
    var order: AnimeOrder? = null

    val kinds = CollectionParameter<AnimeKind>()
    val durations = CollectionParameter<Duration>()
    val ratings = CollectionParameter<AnimeRating>()
    val studios =  CollectionParameter<Int>()
}