package net.pagala.kshikisdk.model

import com.squareup.moshi.Json
import net.pagala.kshikisdk.enums.AnimeKind
import net.pagala.kshikisdk.enums.AnimeRating
import net.pagala.kshikisdk.enums.TitleStatus
import net.pagala.kshikisdk.interfaces.*

data class AnimeInfoModel(
    override val id: Int,
    override val name: String,
    override val russian: String,
    override val image: ImageModel,
    override val url: String,

    @Json(name = "aired_on")
    override val airedOn: String,
    @Json(name = "released_on")
    override val releasedOn: String?,
    override val status: TitleStatus,

    override val kind: AnimeKind,
    override val episodes: Int,
    @Json(name = "episodes_aired")
    override val episodesAired: Int,

    override val english: List<String>,
    override val japanese: List<String>,
    override val synonyms: List<String>,
    override val score: String,
    override val description: String,
    @Json(name = "description_html")
    override val descriptionHtml: String,
    @Json(name = "description_source")
    override val descriptionSource: String?,
    @Json(name = "favoured")
    override val isFavoured: Boolean,
    @Json(name = "anons")
    override val isAnons: Boolean,
    @Json(name = "ongoing")
    override val isOngoing: Boolean,
    @Json(name = "thread_id")
    override val threadId: Int,
    @Json(name = "topic_id")
    override val topicId: Int,
    @Json(name = "myanimelist_id")
    override val myanimelistId: Int,
    @Json(name = "rates_statuses_stats")
    override val ratesStatus: List<RatesStatusModel>,
    @Json(name = "rates_scores_stats")
    override val ratesScore: List<RatesScoreModel>,
    override val genres: List<GenreModel>,
    @Json(name = "user_rate")
    override val titleUserRate: TitleUserRateModel?,

    override val rating: AnimeRating,
    override val duration: Int,
    @Json(name = "updated_at")
    override val updatedAt: String,
    @Json(name = "next_episode_at")
    override val nextEpisodeAt: String?,
    override val studios: List<StudioModel>,
    override val videos: List<VideoModel>,
    override val screenshots: List<ScreenshotModel>
) : AnimeInfo