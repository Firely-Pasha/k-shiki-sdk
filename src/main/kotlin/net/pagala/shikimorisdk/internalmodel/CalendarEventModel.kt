package net.pagala.shikimorisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.shikimorisdk.model.CalendarEvent

internal data class CalendarEventModel(
    @Json(name = "next_episode")
    override val nextEpisode: Int,
    @Json(name = "next_episode_at")
    override val nextEpisodeAt: String,
    override val duration: String?,
    override val anime: AnimeModel
) : CalendarEvent