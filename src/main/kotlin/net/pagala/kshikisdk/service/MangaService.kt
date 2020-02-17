package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.filters.search.MangaSearchFilter
import net.pagala.kshikisdk.interfaces.Manga
import net.pagala.kshikisdk.interfaces.MangaInfo
import net.pagala.kshikisdk.repository.MangaRepository
import net.pagala.kshikisdk.repository.build
import retrofit2.Retrofit

class MangaService(
    retrofit: Retrofit
) {
    private val mangaRepository = retrofit.create(MangaRepository::class.java)

    fun get(manga: Int) = mangaRepository.get(manga) as MangaInfo

    fun getList() = mangaRepository.getList() as List<Manga>

    fun getList(mangaSearchFilter: MangaSearchFilter) =
        mangaRepository.getList(mangaSearchFilter.build()) as List<Manga>

    fun getRoles(manga: Int) = mangaRepository.getRoles(manga)

    fun getSimilar(manga: Int) = mangaRepository.getSimilar(manga) as List<Manga>
}