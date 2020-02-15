package net.pagala.kshikisdk

data class Response<T>(
    val code: Int,
    val data: T,
    val message: String
)