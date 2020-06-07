package net.pagala.kshikisdk.repository

import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.internalmodel.MangaInfoModel
import net.pagala.kshikisdk.internalmodel.MangaModel
import net.pagala.kshikisdk.internalmodel.RelationModel
import net.pagala.kshikisdk.internalmodel.RoleModel
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

internal interface MangaRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "mangas"
    }

    @GET("${URL}/{id}")
    fun get(@Path("id") id: Int): MangaInfoModel

    @GET(URL)
    fun getList(): List<MangaModel>

    @GET(URL)
    fun getList(@QueryMap fields: Map<String, String>): List<MangaModel>

    @GET("$URL/{id}/roles")
    fun getRoles(@Path("id") id: Int): List<RoleModel>

    @GET("$URL/{id}/similar")
    fun getSimilar(@Path("id") id: Int): List<MangaModel>

    @GET("$URL/{id}/related")
    fun getRelated(@Path("id") id: Int): List<RelationModel>
}