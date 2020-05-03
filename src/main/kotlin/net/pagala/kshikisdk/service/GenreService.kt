package net.pagala.kshikisdk.service

import net.pagala.kshikisdk.interfaces.Genre
import net.pagala.kshikisdk.repository.GenreRepository
import retrofit2.Retrofit

class GenreService(
    retrofit: Retrofit
) {

    private val genreRepository = retrofit.create(GenreRepository::class.java)

    fun getList() = genreRepository.getList() as List<Genre>
}