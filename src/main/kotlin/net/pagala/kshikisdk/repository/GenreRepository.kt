package net.pagala.kshikisdk.repository

import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.internalmodel.GenreModel
import retrofit2.http.GET

internal interface GenreRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "genres"
    }

    @GET(URL)
    fun getList(): List<GenreModel>
}