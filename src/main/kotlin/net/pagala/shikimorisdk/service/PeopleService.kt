package net.pagala.shikimorisdk.service

import net.pagala.shikimorisdk.model.Character
import net.pagala.shikimorisdk.model.PersonInfo
import net.pagala.shikimorisdk.repository.PeopleRepository
import retrofit2.Response
import retrofit2.Retrofit

class PeopleService(
    retrofit: Retrofit
) : BaseService() {
    private val peopleRepository: PeopleRepository = retrofit.create(PeopleRepository::class.java)

    suspend fun get(personId: Int) = getResult { peopleRepository.get(personId) as Response<PersonInfo> }

    suspend fun search(query: String) = getResult { peopleRepository.search(query) as Response<List<Character>> }

}