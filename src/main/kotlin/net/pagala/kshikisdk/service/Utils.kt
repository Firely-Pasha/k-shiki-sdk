package net.pagala.kshikisdk.repository

import net.pagala.kshikisdk.filters.search.AnimeSearchFilter
import net.pagala.kshikisdk.filters.search.CollectionParameter
import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import java.net.URLEncoder

fun TitleSearchFilter.buildTitle() = mutableMapOf<String, String>().apply {
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

internal fun AnimeSearchFilter.build() = mutableMapOf<String, String>().apply {
    this += buildTitle()
    order?.let {
        this += "order" to order.toString()
    }
    if (!kinds.isEmpty()) {
        this += "kind" to kinds.build()
    }
    if (!durations.isEmpty()) {
        this += "duration" to durations.build()
    }
    if (!ratings.isEmpty()) {
        this += "rating" to ratings.build()
    }
    if (!studios.isEmpty()) {
        this += "studio" to studios.build()
    }
}

internal fun <T> CollectionParameter<T>.build() = StringBuilder().apply {
    if (include.isNotEmpty()) {
        append(include.joinToString(separator = ",") { t -> t.toString() })
    }
    if (exclude.isNotEmpty()) {
        if (include.isEmpty()) {
            append(',')
        }
        append(exclude.joinToString(separator = ",") { t -> t.toString() })
    }
}.toString()
