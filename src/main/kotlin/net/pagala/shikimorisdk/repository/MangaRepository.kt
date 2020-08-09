package net.pagala.shikimorisdk.repository

import net.pagala.shikimorisdk.ShikimoriSdk
import net.pagala.shikimorisdk.internalmodel.MangaInfoModel
import net.pagala.shikimorisdk.internalmodel.MangaModel
import net.pagala.shikimorisdk.internalmodel.RelationModel
import net.pagala.shikimorisdk.internalmodel.RoleModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.QueryMap

internal interface MangaRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "mangas"
    }

    @GET("$URL/{id}")
    suspend fun get(@Path("id") id: Int): Response<MangaInfoModel>

    @GET(URL)
    suspend fun getList(): List<MangaModel>

    @GET(URL)
    suspend fun getList(@QueryMap fields: Map<String, String>): Response<List<MangaModel>>

    @GET("$URL/{id}/roles")
    suspend fun getRoles(@Path("id") id: Int): Response<List<RoleModel>>

    @GET("$URL/{id}/similar")
    suspend fun getSimilar(@Path("id") id: Int): Response<List<MangaModel>>

    @GET("$URL/{id}/related")
    suspend fun getRelated(@Path("id") id: Int): Response<List<RelationModel>>
}