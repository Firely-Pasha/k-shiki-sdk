package net.pagala.shikimorisdk.enums

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