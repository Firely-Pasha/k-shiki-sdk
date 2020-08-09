package net.pagala.shikimorisdk.filters.search

class CollectionParameter<T> {
    val include = mutableSetOf<T>()
    val exclude = mutableSetOf<T>()

    fun isEmpty() = include.isEmpty() && exclude.isEmpty()

    fun contains(item: T) = include.contains(item) || exclude.contains(item)

    fun clearAll() {
        include.clear()
        exclude.clear()
    }
}