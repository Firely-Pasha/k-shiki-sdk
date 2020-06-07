package net.pagala.kshikisdk.model

interface CharacterInfo : Character {
    val altname: String
    val japanese: String
    val description: String?
    val descriptionHtml: String?
    val descriptionSource: String?
    val favoured: Boolean
    val threadId: Int?
    val topicId: Int?
    val updatedAt: String
    val seyu: List<Character>
    val animes: List<AnimeWithRole>
    val mangasAndRanobes: List<MangaWithRole>
}