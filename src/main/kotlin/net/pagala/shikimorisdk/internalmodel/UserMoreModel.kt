package net.pagala.shikimorisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.shikimorisdk.model.UserMore

data class UserMoreModel(
    override val id: Int,
    override val nickname: String,

    override val avatar: String,
    override val image: UserImageModel,
    @Json(name = "last_online_at")
    override val lastOnlineAt: String,

    override val name: String?,
    override val sex: String?,
    override val website: String?,
    @Json(name = "birth_on")
    override val birthOn: String?
) : UserMore