package net.pagala.kshikisdk.filters.search

import net.pagala.kshikisdk.enums.TitleStatus

abstract class TitleSearchFilter {
    var page: Int? = 1
    var limit: Int? = 10
    var score: Int? = null
    var censored: Boolean? = null
    var query: String? = null

    var statuses = CollectionParameter<TitleStatus>()
    var seasons = CollectionParameter<SeasonYear>()
    var ids = CollectionParameter<Int>()
    var excludeIds = CollectionParameter<Int>()
    var myLists = CollectionParameter<Int>()
    var genres = CollectionParameter<Int>()
}