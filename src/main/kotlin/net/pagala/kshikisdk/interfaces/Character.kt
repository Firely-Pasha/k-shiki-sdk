package net.pagala.kshikisdk.interfaces

interface Character {
    val id: Int
    val name: String
    val russian: String?
    val image: Image
    val url: String
}