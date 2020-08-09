package net.pagala.shikimorisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.shikimorisdk.enums.TitleListStatus
import net.pagala.shikimorisdk.model.TitleUserRate

internal data class TitleUserRateModel(
    override val id: Int,
    override val score: Int,
    override val status: TitleListStatus,
    override val text: String,
    override val episodes: Int,
    override val chapters: Int,
    override val volumes: Int,
    @Json(name = "text_html")
    override val textHtml: String,
    override val rewatches: Int
): TitleUserRate