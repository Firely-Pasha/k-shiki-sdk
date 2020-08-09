package net.pagala.shikimorisdk.filters.search

import net.pagala.shikimorisdk.enums.AnimeKind
import net.pagala.shikimorisdk.enums.AnimeOrder
import net.pagala.shikimorisdk.enums.AnimeRating
import net.pagala.shikimorisdk.enums.Duration
import net.pagala.shikimorisdk.service.build

class AnimeSearchFilter : TitleSearchFilter() {
    var order: AnimeOrder? = null

    var kinds = CollectionParameter<AnimeKind>()
    var durations = CollectionParameter<Duration>()
    var ratings = CollectionParameter<AnimeRating>()
    var studios =  CollectionParameter<Int>()

    override fun build() = mutableMapOf<String, String>().apply {
        this.putAll(super.build())
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
}