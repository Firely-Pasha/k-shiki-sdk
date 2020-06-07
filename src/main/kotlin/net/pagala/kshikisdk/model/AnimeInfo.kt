package net.pagala.kshikisdk.model

import net.pagala.kshikisdk.enums.AnimeRating

interface AnimeInfo: TitleInfo, Anime {
    val rating: AnimeRating
    val duration: Int
    val updatedAt: String
    val nextEpisodeAt: String?
    val studios: List<Studio>
    val videos: List<Video>
    val screenshots: List<Screenshot>
}