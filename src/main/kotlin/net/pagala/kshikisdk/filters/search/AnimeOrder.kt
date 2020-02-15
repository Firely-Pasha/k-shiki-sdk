package net.pagala.kshikisdk.filters.search

enum class AnimeOrder {
    ID,
    RANKED,
    TYPE,
    POPULARITY,
    NAME,
    AIRED_ON,
    EPISODES,
    STATUS,
    RANDOM;

    override fun toString() = name.toLowerCase()
}