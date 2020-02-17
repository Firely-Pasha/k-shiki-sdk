package net.pagala.kshikisdk.interfaces

interface Video : Atom {
    val url: String
    val imageUrl: String
    val playerUrl: String
    val kind: String
    val hosting: String
}