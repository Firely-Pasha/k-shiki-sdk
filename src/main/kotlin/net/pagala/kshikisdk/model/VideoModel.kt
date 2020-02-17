package net.pagala.kshikisdk.model

import com.squareup.moshi.Json
import net.pagala.kshikisdk.interfaces.Video

data class VideoModel(
    override val id: Int,
    override val url: String,
    @Json(name = "image_url")
    override val imageUrl: String,
    @Json(name = "player_url")
    override val playerUrl: String,
    override val name: String,
    override val kind: String,
    override val hosting: String
): Video