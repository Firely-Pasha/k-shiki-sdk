package net.pagala.kshikisdk.repository

import net.pagala.kshikisdk.ShikimoriSdk
import net.pagala.kshikisdk.model.GenreModel
import retrofit2.http.GET

interface GenreRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "genres"
    }

    @GET(URL)
    fun getList(): List<GenreModel>
}