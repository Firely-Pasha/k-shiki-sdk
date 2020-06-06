package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.interfaces.Character
import net.pagala.kshikisdk.repository.CharactersRepository
import retrofit2.Retrofit

class CharacterService(
    retrofit: Retrofit
) {

    private val charactersRepository: CharactersRepository = retrofit.create(CharactersRepository::class.java)

    fun get(characterId: Int) = charactersRepository.get(characterId)

    fun search(query: String) = charactersRepository.search(query) as List<Character>
}