package net.pagala.kshikisdk.interfaces

import net.pagala.kshikisdk.filters.search.TitleStatus

interface Title : Unit {
    val airedOn: String
    val releasedOn: String
    val status: TitleStatus
}