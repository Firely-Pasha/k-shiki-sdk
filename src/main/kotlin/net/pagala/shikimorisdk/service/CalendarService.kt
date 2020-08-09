package net.pagala.shikimorisdk.service

import net.pagala.shikimorisdk.Resource
import net.pagala.shikimorisdk.model.CalendarEvent
import net.pagala.shikimorisdk.repository.CalendarRepository
import retrofit2.Retrofit

class CalendarService(
    retrofit: Retrofit
) : BaseService() {

    private val calendarRepository = retrofit.create(CalendarRepository::class.java)

    suspend fun get() = getResult { calendarRepository.get() } as Resource<List<CalendarEvent>>
}