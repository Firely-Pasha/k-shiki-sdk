package net.pagala.shikimorisdk.service

import net.pagala.shikimorisdk.filters.search.MangaSearchFilter
import net.pagala.shikimorisdk.model.Manga
import net.pagala.shikimorisdk.model.MangaInfo
import net.pagala.shikimorisdk.model.Relation
import net.pagala.shikimorisdk.model.Role
import net.pagala.shikimorisdk.repository.MangaRepository
import retrofit2.Response
import retrofit2.Retrofit

@Suppress("UNCHECKED_CAST")
class MangaService(
    retrofit: Retrofit
) : BaseService() {

    private val titleRepository: MangaRepository = retrofit.create(MangaRepository::class.java)

    suspend fun get(titleId: Int) =
        getResult { titleRepository.get(titleId) as Response<MangaInfo> }

    suspend fun getList() =
        getResult { titleRepository.getList() as Response<List<Manga>> }

    suspend fun getRoles(titleId: Int) =
        getResult { titleRepository.getRoles(titleId) as Response<List<Role>> }

    suspend fun getList(titleSearchFilter: MangaSearchFilter) =
        getResult { titleRepository.getList(titleSearchFilter.build()) as Response<List<Manga>> }

    suspend fun getSimilar(titleId: Int) =
        getResult { titleRepository.getSimilar(titleId) as Response<List<Manga>> }

    suspend fun getRelated(titleId: Int) =
        getResult { titleRepository.getRelated(titleId) as Response<List<Relation>> }
}