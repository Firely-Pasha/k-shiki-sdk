package net.pagala.shikimorisdk.repository

import net.pagala.shikimorisdk.ShikimoriSdk
import net.pagala.shikimorisdk.internalmodel.OAuthTokenModel
import net.pagala.shikimorisdk.internalmodel.RefreshTokenModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

internal interface AuthRepository {

    companion object {
        const val URL = ShikimoriSdk.SITE_URL + "oauth"
    }

    @POST("${URL}/token")
    suspend fun getAccessToken(
        @Body refreshTokenParams: RefreshTokenModel
    ) : Response<OAuthTokenModel>


}