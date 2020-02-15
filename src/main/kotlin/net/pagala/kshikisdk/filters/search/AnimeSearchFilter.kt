package net.pagala.kshikisdk.filters.search

class AnimeSearchFilter : TitleSearchFilter() {
    var order: AnimeOrder? = null

    val kinds = CollectionParameter<AnimeKind>()
    val durations = CollectionParameter<Duration>()
    val ratings = CollectionParameter<AnimeRating>()
    val studios =  CollectionParameter<Int>()
}