package net.pagala.kshikisdk.filters.search

import java.lang.StringBuilder

class CollectionParameter<T> {
    val include = mutableListOf<T>()
    val exclude = mutableListOf<T>()

    fun isEmpty() = include.isEmpty() && exclude.isEmpty()
    fun clearAll() {
        include.clear()
        exclude.clear()
    }
}