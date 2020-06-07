package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.enums.TitleStatus

interface Title : Unit {
    val airedOn: String?
    val releasedOn: String?
    val status: TitleStatus
}