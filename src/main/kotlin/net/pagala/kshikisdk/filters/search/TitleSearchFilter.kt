package net.pagala.kshikisdk.filters.search

import net.pagala.kshikisdk.enums.TitleStatus
import net.pagala.kshikisdk.repository.build
import java.net.URLEncoder

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

    internal open fun build(): Map<String, String> = mutableMapOf<String, String>().apply {
        page?.let {
            this += "page" to page.toString()
        }
        limit?.let {
            this += "limit" to limit.toString()
        }
        score?.let {
            this += "score" to score.toString()
        }
        censored?.let {
            this += "censored" to censored.toString()
        }
        if (!statuses.isEmpty()) {
            this += "status" to statuses.build()
        }
        if (!seasons.isEmpty()) {
            this += "season" to seasons.build()
        }
        if (!ids.isEmpty()) {
            this += "ids" to ids.build()
        }
        if (!excludeIds.isEmpty()) {
            this += "exclude_ids" to ids.build()
        }
        if (!myLists.isEmpty()) {
            this += "mylist" to myLists.build()
        }
        if (!genres.isEmpty()) {
            this += "genre" to genres.build()
        }
        if (!query.isNullOrBlank()) {
            this += "search" to URLEncoder.encode(query, "UTF-8")
        }
    }
}