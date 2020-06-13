package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.model.Character
import net.pagala.kshikisdk.model.PersonInfo
import net.pagala.kshikisdk.repository.PeopleRepository
import retrofit2.Retrofit

class PeopleService(
    retrofit: Retrofit
) {
    private val peopleRepository: PeopleRepository = retrofit.create(PeopleRepository::class.java)

    fun get(personId: Int) = peopleRepository.get(personId) as PersonInfo

    fun search(query: String) = peopleRepository.search(query) as List<Character>

}