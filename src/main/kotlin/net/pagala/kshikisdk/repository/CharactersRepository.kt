package net.pagala.kshikisdk.repository

import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.model.CharacterInfoModel
import net.pagala.kshikisdk.model.CharacterModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharactersRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "characters"
    }

    @GET("${URL}/{id}")
    fun get(@Path("id") id: Int): CharacterInfoModel

    @GET("${URL}/search")
    fun search(@Query("search") query: String): List<CharacterModel>
}