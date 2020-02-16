package net.pagala.kshikisdk.model

data class Character(
    val id: Int,
    val name: String,
    val russian: String?,
    val image: Image,
    val url: String
)