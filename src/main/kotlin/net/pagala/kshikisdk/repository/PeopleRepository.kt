package net.pagala.kshikisdk.repository

import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.internalmodel.CharacterModel
import net.pagala.kshikisdk.internalmodel.PersonInfoModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

internal interface PeopleRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "people"
    }

    @GET("${URL}/{id}")
    fun get(@Path("id") id: Int): PersonInfoModel

    @GET("${URL}/search")
    fun search(@Query("search") query: String): List<CharacterModel>
}