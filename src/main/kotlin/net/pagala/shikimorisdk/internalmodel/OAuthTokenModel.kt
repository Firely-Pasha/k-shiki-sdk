package net.pagala.shikimorisdk.internalmodel

import com.squareup.moshi.Json
import net.pagala.shikimorisdk.model.OAuthToken

internal data class OAuthTokenModel(
    @Json(name = "access_token")
    override val accessToken: String,
    @Json(name = "token_type")
    override val tokenType: String,
    @Json(name = "expires_in")
    override val expiresIn: Int,
    @Json(name = "refresh_token")
    override val refreshToken: String,
    @Json(name = "created_at")
    override val createdAt: String
) : OAuthToken