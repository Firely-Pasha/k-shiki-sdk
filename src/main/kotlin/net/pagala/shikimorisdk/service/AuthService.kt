package net.pagala.shikimorisdk.service

import net.pagala.shikimorisdk.ShikimoriSdk
import net.pagala.shikimorisdk.internalmodel.RefreshTokenModel
import net.pagala.shikimorisdk.model.OAuthToken
import net.pagala.shikimorisdk.repository.AuthRepository
import retrofit2.Response
import retrofit2.Retrofit
import java.util.*

class AuthService(
    retrofit: Retrofit
) : BaseService() {

    private val authRepository = retrofit.create(AuthRepository::class.java)

    fun getLoginUrl(clientId: String, redirectUri: String, scopes: Array<Scope>) =
        "${ShikimoriSdk.SITE_URL}oauth/authorize?client_id=$clientId&redirect_uri=$redirectUri&response_type=code&scope=${scopes.joinToString { it.toString() }}"

    suspend fun requestAccessToken(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String
    ) = getResult {
        authRepository.getAccessToken(
            RefreshTokenModel(
                "authorization_code",
                clientId,
                clientSecret,
                code,
                redirectUri
            )
        ) as Response<OAuthToken>
    }

    enum class Scope {
        USER_RATES
        ;

        override fun toString() = name.toLowerCase(Locale.ROOT)
    }

}