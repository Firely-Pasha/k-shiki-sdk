package net.pagala.shikimorisdk.service

import net.pagala.shikimorisdk.ApiError
import net.pagala.shikimorisdk.Resource
import retrofit2.Response

abstract class BaseService {

    protected suspend fun <T> getResult(call: suspend () -> Response<T>): Resource<T> {
        try {
            call.invoke().run {
                if (isSuccessful) {
                    body()?.let {
                        return Resource.success(it)
                    }
                }
                return error(ApiError(code(), message()))
            }
        } catch (e: Exception) {
            return error(e)
        }
    }

    private fun <T> error(throwable: Throwable): Resource<T> {
        throwable.printStackTrace()
        return Resource.error(throwable)
    }

}
