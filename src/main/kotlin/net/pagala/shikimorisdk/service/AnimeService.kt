package net.pagala.shikimorisdk.service

import net.pagala.shikimorisdk.filters.search.AnimeSearchFilter
import net.pagala.shikimorisdk.model.Anime
import net.pagala.shikimorisdk.model.AnimeInfo
import net.pagala.shikimorisdk.model.Relation
import net.pagala.shikimorisdk.model.Role
import net.pagala.shikimorisdk.repository.AnimeRepository
import retrofit2.Response
import retrofit2.Retrofit

@Suppress("UNCHECKED_CAST")
class AnimeService(
    retrofit: Retrofit
): BaseService() {

    private val titleRepository: AnimeRepository = retrofit.create(AnimeRepository::class.java)

    suspend fun get(titleId: Int) = getResult { titleRepository.get(titleId) as Response<AnimeInfo> }

    suspend fun getList() = getResult { titleRepository.getList() as Response<List<Anime>> }

    suspend fun getRoles(titleId: Int) = getResult { titleRepository.getRoles(titleId) as Response<List<Role>> }

    suspend fun getList(titleSearchFilter: AnimeSearchFilter) = getResult { titleRepository.getList(titleSearchFilter.build()) as Response<List<Anime>> }

    suspend fun getSimilar(titleId: Int) = getResult { titleRepository.getSimilar(titleId) as Response<List<Anime>> }

    suspend fun getRelated(titleId: Int) = getResult { titleRepository.getRelated(titleId) as Response<List<Relation>> }
}