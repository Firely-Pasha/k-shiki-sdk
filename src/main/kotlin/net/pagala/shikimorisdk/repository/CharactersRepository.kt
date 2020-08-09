package net.pagala.shikimorisdk.repository

import net.pagala.shikimorisdk.ShikimoriSdk
import net.pagala.shikimorisdk.internalmodel.CharacterInfoModel
import net.pagala.shikimorisdk.internalmodel.CharacterModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface CharactersRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "characters"
    }

    @GET("$URL/{id}")
    suspend fun get(@Path("id") id: Int): Response<CharacterInfoModel>

    @GET("$URL/search")
    suspend fun search(@Query("search") query: String): Response<List<CharacterModel>>
}