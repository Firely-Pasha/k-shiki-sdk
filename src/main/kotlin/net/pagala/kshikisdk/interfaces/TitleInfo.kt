package net.pagala.kshikisdk.interfaces

interface TitleInfo : Title {
    val english: List<String>
    val japanese: List<String>
    val synonyms: List<String>
    val score: String
    val description: String?
    val descriptionHtml: String?
    val descriptionSource: String?
    val isFavoured: Boolean
    val isAnons: Boolean
    val isOngoing: Boolean
    val threadId: Int?
    val topicId: Int?
    val myanimelistId: Int
    val ratesStatus: List<RatesStatus>
    val ratesScore: List<RatesScore>
    val genres: List<Genre>
    val titleUserRate: TitleUserRate?
}