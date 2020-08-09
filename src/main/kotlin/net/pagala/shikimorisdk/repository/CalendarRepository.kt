package net.pagala.shikimorisdk.repository

import net.pagala.shikimorisdk.ShikimoriSdk
import net.pagala.shikimorisdk.internalmodel.CalendarEventModel
import retrofit2.Response
import retrofit2.http.GET

internal interface CalendarRepository {

    companion object {
        const val URL = ShikimoriSdk.API_PATH + "calendar"
    }

    @GET(URL)
    suspend fun get(): Response<List<CalendarEventModel>>

}