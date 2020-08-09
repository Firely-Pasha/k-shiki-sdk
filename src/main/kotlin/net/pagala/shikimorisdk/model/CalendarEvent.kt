package net.pagala.shikimorisdk.model

/**
 * @property [duration] string value 'cause some items have duration value like "31/1440".
 */
interface CalendarEvent {
    val nextEpisode: Int
    val nextEpisodeAt: String
    val duration: String?
    val anime: Anime
}