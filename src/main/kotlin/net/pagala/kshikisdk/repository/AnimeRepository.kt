package net.pagala.kshikisdk.repository

import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.model.AnimeInfoModel
import net.pagala.kshikisdk.model.AnimeModel
import net.pagala.kshikisdk.model.RelationModel
import net.pagala.kshikisdk.model.RoleModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

interface AnimeRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "animes"
    }

    @GET("$URL/{id}")
    fun get(@Path("id") id: Int): AnimeInfoModel

    @GET(URL)
    fun getList(): List<AnimeModel>

    @GET(URL)
    fun getList(@QueryMap fields: Map<String, String>): List<AnimeModel>

    @GET("$URL/{id}/roles")
    fun getRoles(@Path("id") id: Int): List<RoleModel>

    @GET("$URL/{id}/similar")
    fun getSimilar(@Path("id") id: Int): List<AnimeModel>

    @GET("$URL/{id}/related")
    fun getRelated(@Path("id") id: Int): List<RelationModel>
}