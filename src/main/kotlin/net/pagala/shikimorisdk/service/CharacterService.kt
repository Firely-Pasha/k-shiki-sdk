package net.pagala.shikimorisdk.service

import net.pagala.shikimorisdk.model.Character
import net.pagala.shikimorisdk.model.CharacterInfo
import net.pagala.shikimorisdk.repository.CharactersRepository
import retrofit2.Response
import retrofit2.Retrofit

class CharacterService(
    retrofit: Retrofit
) : BaseService() {

    private val charactersRepository: CharactersRepository = retrofit.create(CharactersRepository::class.java)

    suspend fun get(characterId: Int) = getResult { charactersRepository.get(characterId) as Response<CharacterInfo> }

    suspend fun search(query: String) = getResult { charactersRepository.search(query) as Response<List<Character>> }
}