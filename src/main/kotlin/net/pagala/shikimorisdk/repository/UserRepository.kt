package net.pagala.shikimorisdk.repository

import net.pagala.shikimorisdk.ShikimoriSdk
import net.pagala.shikimorisdk.internalmodel.UserMoreModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface UserRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "users"
    }

    @GET("${URL}/whoami")
    suspend fun whoAmI(@Header("Authorization") token: String?): Response<UserMoreModel>
}