package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.model.Character
import net.pagala.kshikisdk.model.CharacterInfo
import net.pagala.kshikisdk.repository.CharactersRepository
import retrofit2.Retrofit

class CharacterService(
    retrofit: Retrofit
) {

    private val charactersRepository: CharactersRepository = retrofit.create(CharactersRepository::class.java)

    fun get(characterId: Int) = charactersRepository.get(characterId) as CharacterInfo

    fun search(query: String) = charactersRepository.search(query) as List<Character>
}