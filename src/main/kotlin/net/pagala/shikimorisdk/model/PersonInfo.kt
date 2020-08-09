package net.pagala.shikimorisdk.model

interface PersonInfo : Character {
    val japanese: String
    val jobTitle: String?
    val birthday: String?
    val website: String?
    val groupedRoles: List<Array<String>>
    val roles: List<PersonRole>
    val works: List<PersonWork>
    val threadId: Int?
    val topicId: Int?
    val personFavoured: Boolean
    val producer: Boolean
    val producerFavoured: Boolean
    val mangaka: Boolean
    val mangakaFavoured: Boolean
    val seyu: Boolean
    val seyuFavoured: Boolean
    val updatedAt: String
}