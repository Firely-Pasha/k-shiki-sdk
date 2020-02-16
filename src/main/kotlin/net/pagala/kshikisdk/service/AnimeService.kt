package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.filters.search.AnimeSearchFilter
import net.pagala.kshikisdk.interfaces.Anime
import net.pagala.kshikisdk.repository.AnimeRepository
import net.pagala.kshikisdk.repository.build
import retrofit2.Retrofit

class AnimeService(
    retrofit: Retrofit
) {
    private val animeRepository: AnimeRepository = retrofit.create(AnimeRepository::class.java)

    fun getList() = animeRepository.getList() as List<Anime>

    fun getList(animeSearchFilter: AnimeSearchFilter) =
        animeRepository.getList(animeSearchFilter.build()) as List<Anime>

    fun getRoles(anime: Int) = animeRepository.getRoles(anime)

    fun getSimilar(anime: Int) = animeRepository.getSimilar(anime) as List<Anime>
}