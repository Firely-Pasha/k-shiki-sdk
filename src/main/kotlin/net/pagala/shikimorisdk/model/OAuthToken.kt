package net.pagala.shikimorisdk.model

interface OAuthToken {
    val accessToken: String
    val tokenType: String
    val expiresIn: Int
    val refreshToken: String
    val createdAt: String
}