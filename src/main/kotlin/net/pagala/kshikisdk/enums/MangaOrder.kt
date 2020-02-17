package net.pagala.kshikisdk.enums

enum class MangaOrder {
    ID,
    RANKED,
    TYPE,
    POPULARITY,
    NAME,
    AIRED_ON,
    VOLUMES,
    CHAPTERS,
    STATUS,
    RANDOM;

    override fun toString(): String {
        return name.toLowerCase()
    }
}