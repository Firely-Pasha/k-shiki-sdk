package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.filters.search.AnimeSearchFilter
import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import net.pagala.kshikisdk.interfaces.Anime
import net.pagala.kshikisdk.interfaces.AnimeInfo
import net.pagala.kshikisdk.repository.AnimeRepository
import retrofit2.Retrofit

@Suppress("UNCHECKED_CAST")
class AnimeService(
    retrofit: Retrofit
) : TitleService() {

    override val titleRepository: AnimeRepository = retrofit.create(AnimeRepository::class.java)

    override fun get(titleId: Int) = super.get(titleId) as AnimeInfo

    override fun getList() = super.getList() as List<Anime>

    /**
     * @param titleSearchFilter Use [AnimeSearchFilter] class
     */
    override fun getList(titleSearchFilter: TitleSearchFilter) = super.getList(titleSearchFilter) as List<Anime>

    override fun getSimilar(titleId: Int) = super.getSimilar(titleId) as List<Anime>

}