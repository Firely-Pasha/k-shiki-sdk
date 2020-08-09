package net.pagala.shikimorisdk.repository

import net.pagala.shikimorisdk.ShikimoriSdk
import net.pagala.shikimorisdk.internalmodel.GenreModel
import retrofit2.Response
import retrofit2.http.GET

internal interface GenreRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "genres"
    }

    @GET(URL)
    suspend fun getList(): Response<List<GenreModel>>
}