package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.filters.search.AnimeSearchFilter
import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import net.pagala.kshikisdk.model.Anime
import net.pagala.kshikisdk.model.AnimeInfo
import net.pagala.kshikisdk.model.Relation
import net.pagala.kshikisdk.model.Role
import net.pagala.kshikisdk.repository.AnimeRepository
import retrofit2.Retrofit

@Suppress("UNCHECKED_CAST")
class AnimeService(
    retrofit: Retrofit
) : TitleService {

    private val titleRepository: AnimeRepository = retrofit.create(AnimeRepository::class.java)

    override fun get(titleId: Int) = titleRepository.get(titleId) as AnimeInfo

    override fun getList() = titleRepository.getList() as List<Anime>

    override fun getRoles(titleId: Int) = titleRepository.getRoles(titleId) as List<Role>

    /**
     * @param titleSearchFilter Use [AnimeSearchFilter] class
     */
    override fun getList(titleSearchFilter: TitleSearchFilter) = titleRepository.getList(titleSearchFilter.build()) as List<Anime>

    override fun getSimilar(titleId: Int) = titleRepository.getSimilar(titleId) as List<Anime>

    override fun getRelated(titleId: Int) = titleRepository.getRelated(titleId) as List<Relation>
}