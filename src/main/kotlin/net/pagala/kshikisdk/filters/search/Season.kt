package net.pagala.kshikisdk.filters.search

enum class Season {
    SUMMER,
    WINTER,
    SPRING,
    FALL;

    override fun toString(): String {
        return name.toLowerCase()
    }
}
