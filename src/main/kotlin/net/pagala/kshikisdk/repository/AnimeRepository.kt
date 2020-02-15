package net.pagala.kshikisdk.repository

import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.model.anime.AnimeModel
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface AnimeRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "animes"
    }


    @GET(URL)
    fun getList(): List<AnimeModel>

    @GET(URL)
    fun getList(@QueryMap fields: Map<String, String>): List<AnimeModel>
}