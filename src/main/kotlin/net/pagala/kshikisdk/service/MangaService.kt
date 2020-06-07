package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.filters.search.MangaSearchFilter
import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import net.pagala.kshikisdk.model.Manga
import net.pagala.kshikisdk.model.MangaInfo
import net.pagala.kshikisdk.model.Relation
import net.pagala.kshikisdk.model.Role
import net.pagala.kshikisdk.repository.MangaRepository
import retrofit2.Retrofit

@Suppress("UNCHECKED_CAST")
class MangaService(
    retrofit: Retrofit
) : TitleService {

    private val titleRepository: MangaRepository = retrofit.create(MangaRepository::class.java)

    override fun get(titleId: Int) = titleRepository.get(titleId) as MangaInfo

    override fun getList() = titleRepository.getList() as List<Manga>

    override fun getRoles(titleId: Int) = titleRepository.getRoles(titleId) as List<Role>

    /**
     * @param titleSearchFilter Use [MangaSearchFilter] class
     */
    override fun getList(titleSearchFilter: TitleSearchFilter) = titleRepository.getList(titleSearchFilter.build()) as List<Manga>

    override fun getSimilar(titleId: Int) = titleRepository.getSimilar(titleId) as List<Manga>

    override fun getRelated(titleId: Int) = titleRepository.getRelated(titleId) as List<Relation>
}