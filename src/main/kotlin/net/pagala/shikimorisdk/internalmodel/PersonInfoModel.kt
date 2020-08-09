package net.pagala.shikimorisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.shikimorisdk.model.PersonInfo

internal data class PersonInfoModel(
    override val id: Int,
    override val name: String,
    override val russian: String?,
    override val image: ImageModel,
    override val url: String,

    override val japanese: String,
    @Json(name = "job_title")
    override val jobTitle: String?,
    override val birthday: String?,
    override val website: String?,
    @Json(name = "groupped_roles")
    override val groupedRoles: List<Array<String>>,
    override val roles: List<PersonRoleModel>,
    override val works: List<PersonWorkModel>,
    @Json(name = "thread_id")
    override val threadId: Int?,
    @Json(name = "topic_id")
    override val topicId: Int?,
    @Json(name = "person_favoured")
    override val personFavoured: Boolean,
    override val producer: Boolean,
    @Json(name = "producer_favoured")
    override val producerFavoured: Boolean,
    override val mangaka: Boolean,
    @Json(name = "mangaka_favoured")
    override val mangakaFavoured: Boolean,
    override val seyu: Boolean,
    @Json(name = "seyu_favoured")
    override val seyuFavoured: Boolean,
    @Json(name = "updated_at")
    override val updatedAt: String
): PersonInfo