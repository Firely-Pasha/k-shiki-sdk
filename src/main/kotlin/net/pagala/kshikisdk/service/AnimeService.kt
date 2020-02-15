package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.filters.search.AnimeSearchFilter
import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import net.pagala.kshikisdk.repository.AnimeRepository
import net.pagala.kshikisdk.repository.build
import retrofit2.Retrofit

class AnimeService(
    retrofit: Retrofit
) {
    private val animeRepository: AnimeRepository = retrofit.create(AnimeRepository::class.java)

    fun getList() = animeRepository.getList()

    fun getList(animeSearchFilter: AnimeSearchFilter) = animeRepository.getList(animeSearchFilter.build())
}