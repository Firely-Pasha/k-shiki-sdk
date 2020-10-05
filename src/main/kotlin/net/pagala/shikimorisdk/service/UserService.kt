package net.pagala.shikimorisdk.service

import net.pagala.shikimorisdk.model.UserMore
import net.pagala.shikimorisdk.repository.UserRepository
import retrofit2.Response
import retrofit2.Retrofit

class UserService(
    retrofit: Retrofit
) : BaseService() {

    private val userRepository = retrofit.create(UserRepository::class.java)

    suspend fun whoAmI(token: String?) = getResult { userRepository.whoAmI(prepareToken(token)) as Response<UserMore> }

}