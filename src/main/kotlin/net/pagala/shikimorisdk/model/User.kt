package net.pagala.shikimorisdk.model

interface User: UserShort {
    val avatar: String
    val image: UserImage
    val lastOnlineAt: String
}