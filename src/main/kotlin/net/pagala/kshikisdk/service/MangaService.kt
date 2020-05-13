package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.filters.search.MangaSearchFilter
import net.pagala.kshikisdk.filters.search.TitleSearchFilter
import net.pagala.kshikisdk.interfaces.Manga
import net.pagala.kshikisdk.interfaces.MangaInfo
import net.pagala.kshikisdk.repository.MangaRepository
import retrofit2.Retrofit

@Suppress("UNCHECKED_CAST")
class MangaService(
    retrofit: Retrofit
) : TitleService() {
    override val titleRepository: MangaRepository = retrofit.create(MangaRepository::class.java)

    override fun get(titleId: Int) = super.get(titleId) as MangaInfo

    override fun getList() = super.getList() as List<Manga>

    /**
     * @param titleSearchFilter Use [MangaSearchFilter] class
     */
    override fun getList(titleSearchFilter: TitleSearchFilter) = super.getList(titleSearchFilter) as List<Manga>

    override fun getSimilar(titleId: Int) = super.getSimilar(titleId) as List<Manga>
}