package net.pagala.kshikisdk.interfaces

interface Video {
    val id: Int
    val name: String?
    val url: String
    val imageUrl: String
    val playerUrl: String
    val kind: String
    val hosting: String
}