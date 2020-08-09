package net.pagala.shikimorisdk

class ApiError(
    val code: Int,
    message: String
) : Throwable(message)