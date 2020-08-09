package net.pagala.shikimorisdk.model

interface Studio : Atom {
    val filteredName: String
    val real: Boolean
    val image: String?
}