package net.pagala.kshikisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.kshikisdk.enums.MangaKind
import net.pagala.kshikisdk.enums.TitleStatus
import net.pagala.kshikisdk.model.MangaInfo

internal data class MangaInfoModel(
    override val id: Int,
    override val name: String,
    override val russian: String,
    override val image: ImageModel,
    override val url: String,

    @Json(name = "aired_on")
    override val airedOn: String?,
    @Json(name = "released_on")
    override val releasedOn: String?,
    override val status: TitleStatus,

    override val kind: MangaKind,
    override val volumes: Int,
    override val chapters: Int,

    override val english: List<String>,
    override val japanese: List<String>,
    override val synonyms: List<String>,
    override val score: String,
    override val description: String?,
    @Json(name = "description_html")
    override val descriptionHtml: String?,
    @Json(name = "description_source")
    override val descriptionSource: String?,
    @Json(name = "favoured")
    override val isFavoured: Boolean,
    @Json(name = "anons")
    override val isAnons: Boolean,
    @Json(name = "ongoing")
    override val isOngoing: Boolean,
    @Json(name = "thread_id")
    override val threadId: Int?,
    @Json(name = "topic_id")
    override val topicId: Int?,
    @Json(name = "myanimelist_id")
    override val myanimelistId: Int,
    @Json(name = "rates_statuses_stats")
    override val ratesStatus: List<RatesStatusModel>,
    @Json(name = "rates_scores_stats")
    override val ratesScore: List<RatesScoreModel>,
    override val genres: List<GenreModel>,
    @Json(name = "user_rate")
    override val titleUserRate: TitleUserRateModel?,

    override val publishers: List<PublisherModel>
) : MangaInfo