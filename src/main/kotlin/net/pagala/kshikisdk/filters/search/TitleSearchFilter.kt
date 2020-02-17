package net.pagala.kshikisdk.filters.search

import net.pagala.kshikisdk.enums.TitleStatus

abstract class TitleSearchFilter {
    var page: Int? = 1
    var limit: Int? = 10
    var score: Int? = null
    var censored: Boolean? = null
    var query: String? = null

    val statuses = CollectionParameter<TitleStatus>()
    val seasons = CollectionParameter<SeasonYear>()
    val ids = CollectionParameter<Int>()
    val excludeIds = CollectionParameter<Int>()
    val myLists = CollectionParameter<Int>()
    val genres = CollectionParameter<Int>()
}