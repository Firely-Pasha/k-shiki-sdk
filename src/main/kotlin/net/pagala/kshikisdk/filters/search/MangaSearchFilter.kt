package net.pagala.kshikisdk.filters.search

import net.pagala.kshikisdk.enums.MangaKind
import net.pagala.kshikisdk.enums.MangaOrder
import net.pagala.kshikisdk.repository.build

class MangaSearchFilter : TitleSearchFilter() {
    var order: MangaOrder? = null

    var kinds = CollectionParameter<MangaKind>()
    var publishers = CollectionParameter<Int>()

    override fun build(): Map<String, String> = mutableMapOf<String, String>().apply {
        this.putAll(super.build())
        order?.let {
            this += "order" to order.toString()
        }
        if (!kinds.isEmpty()) {
            this += "kind" to kinds.build()
        }
        if (!publishers.isEmpty()) {
            this += "publisher" to publishers.build()
        }
    }
}