package net.pagala.shikimorisdk.service

import net.pagala.shikimorisdk.model.Genre
import net.pagala.shikimorisdk.repository.GenreRepository
import retrofit2.Response
import retrofit2.Retrofit

class GenreService(
    retrofit: Retrofit
) : BaseService() {

    private val genreRepository = retrofit.create(GenreRepository::class.java)

    suspend fun getList() = getResult { genreRepository.getList() as Response<List<Genre>> }
}