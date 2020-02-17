package net.pagala.kshikisdk.interfaces

interface Studio {
    val id: Int
    val name: String
    val filteredName: String
    val real: Boolean
    val image: String?
}