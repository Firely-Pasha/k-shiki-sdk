package net.pagala.shikimorisdk.internalmodel

import com.squareup.moshi.Json

internal data class RefreshTokenModel(
    @Json(name = "grant_type")
    val grantType: String,
    @Json(name = "client_id")
    val clientId: String,
    @Json(name = "client_secret")
    val clientSecret: String,
    val code: String,
    @Json(name = "redirect_uri")
    val redirectUri: String
)