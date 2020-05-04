package net.pagala.kshikisdk.filters.search

import net.pagala.kshikisdk.enums.AnimeKind
import net.pagala.kshikisdk.enums.AnimeOrder
import net.pagala.kshikisdk.enums.AnimeRating
import net.pagala.kshikisdk.enums.Duration

class AnimeSearchFilter : TitleSearchFilter() {
    var order: AnimeOrder? = null

    var kinds = CollectionParameter<AnimeKind>()
    var durations = CollectionParameter<Duration>()
    var ratings = CollectionParameter<AnimeRating>()
    var studios =  CollectionParameter<Int>()
}