package net.pagala.kshikisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.kshikisdk.model.CharacterInfo

internal data class CharacterInfoModel(
    override val id: Int,
    override val name: String,
    override val russian: String?,
    override val image: ImageModel,
    override val url: String,

    override val altname: String,
    override val japanese: String,
    override val description: String?,
    @Json(name = "description_html")
    override val descriptionHtml: String?,
    @Json(name = "description_source")
    override val descriptionSource: String?,
    override val favoured: Boolean,
    @Json(name = "thread_id")
    override val threadId: Int?,
    @Json(name = "topic_id")
    override val topicId: Int?,
    @Json(name = "updated_at")
    override val updatedAt: String,
    override val seyu: List<CharacterModel>,
    override val animes: List<AnimeWithRoleModel>,
    @Json(name = "mangas")
    override val mangasAndRanobes: List<MangaWithRoleModel>
): CharacterInfo