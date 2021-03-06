package net.pagala.shikimorisdk.model

import net.pagala.shikimorisdk.enums.TitleListStatus

interface TitleUserRate {
    val id: Int
    val score: Int
    val status: TitleListStatus
    val text: String
    val episodes: Int
    val chapters: Int
    val volumes: Int
    val textHtml: String
    val rewatches: Int
}