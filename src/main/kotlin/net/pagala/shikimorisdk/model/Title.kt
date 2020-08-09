package net.pagala.shikimorisdk.model

import net.pagala.shikimorisdk.enums.TitleStatus

interface Title : Unit {
    val airedOn: String?
    val releasedOn: String?
    val status: TitleStatus
}