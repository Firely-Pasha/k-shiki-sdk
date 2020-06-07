package net.pagala.kshikisdk.model

interface Video {
    val id: Int
    val name: String?
    val url: String
    val imageUrl: String
    val playerUrl: String
    val kind: String
    val hosting: String
}