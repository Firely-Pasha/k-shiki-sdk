package net.pagala.kshikisdk.filters.search

import net.pagala.kshikisdk.enums.AnimeKind
import net.pagala.kshikisdk.enums.AnimeOrder
import net.pagala.kshikisdk.enums.AnimeRating
import net.pagala.kshikisdk.enums.Duration
import net.pagala.kshikisdk.repository.build

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