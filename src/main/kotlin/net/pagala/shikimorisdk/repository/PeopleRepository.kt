package net.pagala.shikimorisdk.repository

import net.pagala.shikimorisdk.ShikimoriSdk
import net.pagala.shikimorisdk.internalmodel.CharacterModel
import net.pagala.shikimorisdk.internalmodel.PersonInfoModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface PeopleRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "people"
    }

    @GET("$URL/{id}")
    suspend fun get(@Path("id") id: Int): Response<PersonInfoModel>

    @GET("$URL/search")
    suspend fun search(@Query("search") query: String): Response<List<CharacterModel>>
}