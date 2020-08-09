package net.pagala.shikimorisdk.enums

enum class Season {
    SUMMER,
    WINTER,
    SPRING,
    FALL;

    override fun toString(): String {
        return name.toLowerCase()
    }
}
